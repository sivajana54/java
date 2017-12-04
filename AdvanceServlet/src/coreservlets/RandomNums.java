package coreservlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RandomNums extends HttpServlet {
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
      throws ServletException, IOException {
    response.setHeader("Cache-Control", "no-cache");
    response.setHeader("Pragma", "no-cache");
    double[] nums = 
      { Math.random(), Math.random(), Math.random() };
    request.setAttribute("nums", nums);
    String outputPage = "/WEB-INF/results/nums.jsp";
    RequestDispatcher dispatcher =
      request.getRequestDispatcher(outputPage);
    dispatcher.include(request, response);
  }
  
  public void doPost(HttpServletRequest request,
                     HttpServletResponse response)
      throws ServletException, IOException {
    doGet(request, response);
  }
}
