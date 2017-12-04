package statusCodes;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/random-destination")
public class RandomDestination extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
      throws ServletException, IOException {
    if (Math.random() < 0.5) {
      response.sendRedirect("http://www.google.com");
    } else {
      response.sendRedirect("http://www.bing.com");
    }
  }
}
