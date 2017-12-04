package statusCodes;  

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/java-only")
public class JavaOnly extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
      throws ServletException, IOException {
    String lang = request.getParameter("favoriteLanguage");
    if ((lang == null) || (!lang.equalsIgnoreCase("java"))) {
      response.sendError(HttpServletResponse.SC_NOT_FOUND,
                         "Cannot find page on that bogus language.");
    } else {
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      String title = "The Real Language";
      String docType =
        "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 " +
        "Transitional//EN\">\n";
      out.println(docType +
                  "<HTML>\n" +
                  "<HEAD><TITLE>" + title + "</TITLE></HEAD>\n" +
                  "<BODY BGCOLOR=\"#FDF5E6\">\n" +
                  "<H1 ALIGN=\"CENTER\">" + title + "</H1>\n" +
                  "Thanks for using Java on the server.\n" +
                  "</BODY></HTML>");
    }
  }
}
