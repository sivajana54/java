

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import in.vamsoft.dao.EmployeeDao;
import in.vamsoft.dao.EmployeeDaoImpl;
import in.vamsoft.model.Employee;

/**
 * Servlet implementation class EmployeeDetails
 */
@WebServlet("/EmployeeDetails")
public class EmployeeDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int deptId =Integer.parseInt(request.getParameter("DEPARTMENT_NAME"));
		EmployeeDaoImpl dao = new EmployeeDaoImpl();
		List<Employee> emp =dao.getAllEmployee(deptId);
		HttpSession session =request.getSession();
		session.setAttribute("emp", emp);
		response.sendRedirect("listTable.jsp");
	}
	

}