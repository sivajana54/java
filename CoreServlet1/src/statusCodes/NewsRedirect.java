package statusCodes;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/news")
public class NewsRedirect extends HttpServlet {
  private int count = 1;
  
  @Override
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
      throws ServletException, IOException {
    String destination;
    synchronized(this) {
      if (count == 10) {
        destination = "http://www.nytimes.com/";
        count = 1;
      } else {
        count = count + 1;
        destination = "http://www.washingtonpost.com";
      }
    }
    response.sendRedirect(destination);
  }
}
