

import java.io.IOException;
import java.io.PrintWriter;

import javax.print.attribute.ResolutionSyntax;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import in.vamsoft.dao.EmployeeDaoImpl;
import in.vamsoft.model.Employee;

/**
 * Servlet implementation class AddEmployee
 */
@WebServlet("/AddEmployee")
public class AddEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  System.out.println("inside the dopost method");
	  HttpSession session =request.getSession();
	  PrintWriter out = response.getWriter();
      
	  int empId =Integer.parseInt(request.getParameter("EMPLOYEE_ID"));
	  System.out.println(empId);
	  String empname =  request.getParameter("FIRST_NAME");
	  System.out.println(empname);
	  Double salary =Double.parseDouble(request.getParameter("SALARY"));
	  System.out.println(salary);
	  /*int deptId =Integer.parseInt(request.getParameter("DEPARTMENT_ID"));
	  System.out.println(deptId);*/
	  Employee employee = new Employee(empId, empname, salary);
       new EmployeeDaoImpl().add(employee);
      
        out.print("sucess");
     response.sendRedirect("listTable.jsp");
     
    
	}
}



