package in.vamsoft.training.calulateSalary;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Catch;

import oracle.net.aso.d;

/**
 * Servlet implementation class EmployeeServlet
 */
public class EmployeeServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * @see HttpServlet#HttpServlet()
   */
  public EmployeeServlet() {
    super();
    // TODO Auto-generated constructor stub
  }

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
   *      response)
   */
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  try {
    String username = request.getParameter("username");
    String doj = request.getParameter("doj");
    String email = request.getParameter("email");
    
    if(username.length()==0 || doj.length()==0 || email.length()==0) {
      throw new NullPointerException("The Null Pointer Exception Ocurred!");
    
    }
    
    
    request.setAttribute("username", username);
    request.setAttribute("doj", doj);
    request.setAttribute("email", email);
    
    LocalDate localdate = LocalDate.parse(doj, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    LocalDate currentdate = LocalDate.now();
    long days = ChronoUnit.DAYS.between(localdate, currentdate);
    System.out.println(days);
    
    

    if ((days <= 364)) {
      request.setAttribute("salary", 13000);

    } else if (days >= 364 && days <= 727) {
      request.setAttribute("salary", 28000);
    } else {
      request.setAttribute("salary", 38000);
    }
    
  }catch (NullPointerException e) {
    request.setAttribute("The  Exception are Occured", e);
      RequestDispatcher reqdispatcher =request.getRequestDispatcher("ErrorHandleServlet");
      reqdispatcher.forward(request, response);
    
  }catch (IllegalStateException e) {
    request.setAttribute("The error pls check valid it", e);
    RequestDispatcher reqdispatcher =request.getRequestDispatcher("ErrorHandleServlet");
    reqdispatcher.forward(request, response);
  }
  
  RequestDispatcher dispatcher = request.getRequestDispatcher("SalarySlipServlet");
  dispatcher.forward(request, response);
  }

}