package in.vamsoft.training.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CalulatorServlet
 */
@WebServlet("/CalulatorServlet")
public class CalulatorServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * @see HttpServlet#HttpServlet()
   */
  public CalulatorServlet() {
    super();
    // TODO Auto-generated constructor stub
  }

  /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
   *      response)
   */
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    System.out.println("inside the calcilator servlet");
    HttpSession session;
    try {
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      int a1 = Integer.parseInt(request.getParameter("n1"));
      int a2 = Integer.parseInt(request.getParameter("n2"));
      if (request.getParameter("r1") != null) {
        out.println("The Result:");
        out.println("<h4>Addition</h4>" + (a1 + a2));
      }
      if (request.getParameter("r2") != null) {
        out.println("The Result:");
        out.println("<h4>Substraction</h4>" + (a1 - a2));
      }
      if (request.getParameter("r3") != null) {
        out.println("The Result:");
        out.println("<h4>Multiplication</h4>" + (a1 * a2));
      }
      if (request.getParameter("r4") != null) {
        out.println("The Result:");
        out.println("<h4>Division</h4>" + (a1 / a2));
      }
    } catch (Exception e) {

    }
   

    /*RequestDispatcher dispatcher = request.getRequestDispatcher("calulatedResult.jsp");
    dispatcher.forward(request, response);*/
  }

}
