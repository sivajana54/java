package coreservlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class NameServlet1 extends HttpServlet {
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
      throws ServletException, IOException {
    String[] names = 
      { "Joe", "Jane", "John", "Juan", "Jack", "Jill" };
    request.setAttribute("firstNames", names);
    String address = "/WEB-INF/results/name-loop-1.jsp";
    RequestDispatcher dispatcher = 
      request.getRequestDispatcher(address);
    dispatcher.forward(request, response);
  }
}
