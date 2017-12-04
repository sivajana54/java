package in.vamsoft.training.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static Logger logger = Logger.getLogger(FirstServlet.class);

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	/*protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html><body bgcolor=blue>");
		out.println("<h1>Hello !! Welcome to Servlet</h1>");
		out.println("</body></html>");
	}
*/



Connection connection;
PreparedStatement preparedStatement;
 @Override

 public void init() throws ServletException {
  
   connection = DBConnectionUtil.getConnection();
   super.init();
 } 
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         PrintWriter out = response.getWriter();
         response .setContentType("text/html");
         String username =request.getParameter("username");
         String dob =request.getParameter("dob");
         String address =request.getParameter("address");
         String mobilenumber =request.getParameter("mobilenumber");
         String gender = request.getParameter("gender");
         String hobbies =request.getParameter("hobbies");
         System.out.println("connection done");
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         LocalDate date;
         date=LocalDate.parse(br.readLine(),DateTimeFormatter.ofPattern("dd-MM-yyyy"));
       
         try (PreparedStatement preparedStatement = connection.prepareStatement("insert into customerreg1 values(?,?,?,?,?)");) {
           preparedStatement.setString(1 ,username);
           preparedStatement.setDate(2, Date.valueOf(date));
           preparedStatement.setString(3,address );
           preparedStatement.setString(4, mobilenumber);
           preparedStatement.setString(5, gender);
           preparedStatement.setString(6, hobbies);

           int rowsUpdate = preparedStatement.executeUpdate();
         System.out.println(username);
         System.out.println(dob);
         System.out.println(address);
         System.out.println(mobilenumber);
    
    System.out.println(gender);
     System.out.println(hobbies);
    } catch (SQLException e) {
        logger.error(e);
    
  }

}
}