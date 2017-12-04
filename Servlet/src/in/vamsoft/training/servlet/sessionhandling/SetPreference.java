package in.vamsoft.training.servlet.sessionhandling;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SetPreference
 */
public class SetPreference extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * @see HttpServlet#HttpServlet()
   */
  public SetPreference() {
    super();
    // TODO Auto-generated constructor stub
  }

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
   *      response)
   */
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String name = request.getParameter("name");
    String colour = request.getParameter("colour");

    Cookie namecookie = new Cookie("name", name);
    Cookie colourcookie = new Cookie("colour", colour);

    response.addCookie(namecookie);
    response.addCookie(colourcookie);

    response.getWriter()
        .println("<html><body><h1>Hello" + name + "The select colour is" + colour + "</h1></body></html>");
  }

}
