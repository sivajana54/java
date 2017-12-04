package in.vamsoft.training.calulateSalary;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ErrorHandleServlet
 */
public class ErrorHandleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ErrorHandleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  String username =request.getParameter("username");
	  String doj = request.getParameter("doj");
	    String email = request.getParameter("email");
      PrintWriter out =response.getWriter();
      //out.println("<h1 style=\"color:red;>Sorry"+""+uname+""+"Was not correct pls check it!</h1>");
      out.println("<h1>The  Exception are Occured"+""+username+""+doj+""+email+""+"</h1>");
      RequestDispatcher reqdis =request.getRequestDispatcher("EmployeeDetails.html");
      reqdis.include(request, response);
	}

}
