

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.vamsoft.dao.EmployeeDaoImpl;
import in.vamsoft.model.Employee;

/**
 * Servlet implementation class DeleteEmployee
 */
@WebServlet("/DeleteEmployee")
public class DeleteEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         PrintWriter out = response.getWriter();
      
      int empId =Integer.parseInt(request.getParameter("EMPLOYEE_ID"));
      System.out.println(empId);
      Employee empoyee =new Employee(empId);
     // new EmployeeDaoImpl().add(employee);
      EmployeeDaoImpl dao = new EmployeeDaoImpl();
      try {
        dao.delete(empId);
      } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
        //new EmployeeDaoImpl().delete(empId);
   //response.sendRedirect("insert.jsp");
      out.print("Sucess");
	}

}
