package in.vamsoft.training.calulateSalary;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SalarySlipServlet
 */
public class SalarySlipServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * @see HttpServlet#HttpServlet()
   */
  public SalarySlipServlet() {
    super();
    // TODO Auto-generated constructor stub
  }

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
   *      response)
   */
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String username = (String) request.getParameter("username");
    String doj = (String) request.getParameter("doj");
    String email = (String) request.getParameter("email");
    int salary = (int) request.getAttribute("salary");

    double bonus = salary * 0.1;
    double hra = salary * 0.1;
    double tax = salary * 0.12;
    double total = salary + bonus + hra - tax;
    PrintWriter out = response.getWriter();
    out.println("Username :" + "--" + username);
    out.println("doj :" + "--" + doj);
    out.println("email :" + "--" + email);
    out.println("salary :" + "--" + salary);
    out.println("bonus :" + "--" + bonus);
    out.println("hra :" + "--" + hra);
    out.println("tax :" + "--" + tax);
    out.println("total :" + "--" + total);
  }

}
