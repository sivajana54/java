package coreservlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class NameServlet3 extends HttpServlet {
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
      throws ServletException, IOException {
    Name[] names = 
      { new Name("Harry", "Hacker"), 
        new Name("Patty", "Programmer"), 
        new Name("Codie", "Coder"),
        new Name("Denise", "Developer") };
    request.setAttribute("names", names);
    String address = "/WEB-INF/results/name-loop-2.jsp";
    RequestDispatcher dispatcher = 
      request.getRequestDispatcher(address);
    dispatcher.forward(request, response);
  }
}
