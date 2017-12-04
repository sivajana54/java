package in.vamsoft.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;


  public LogoutServlet() {
    super();
    // TODO Auto-generated constructor stub
  }


  protected void doGet(HttpServletRequest request, HttpServletResponse response) 
                                             throws ServletException, IOException {
    System.out.println("Logout Servlet");
    request.getSession().invalidate();
    response.sendRedirect(request.getContextPath() + "/index.jsp");
  }

}
