package coreservlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class NameServlet2 extends HttpServlet {
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
      throws ServletException, IOException {
    List<String> names = new ArrayList<String>();
    names.add("Joe");
    names.add("Jane");
    names.add("John");
    names.add("Juan");
    names.add("Jack");
    names.add("Jill");
    request.setAttribute("firstNames", names);
    String address = "/WEB-INF/results/name-loop-1.jsp";
    RequestDispatcher dispatcher = 
      request.getRequestDispatcher(address);
    dispatcher.forward(request, response);
  }
}
