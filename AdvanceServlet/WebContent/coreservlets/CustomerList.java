package coreservlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class CustomerList extends HttpServlet {
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
      throws ServletException, IOException {
    String[] ids = getIDs(request);
    List<Customer> customers = new ArrayList<Customer>();
    for(String id: ids) {
      customers.add(CustomerUtils.getCustomerOrDefault(id));
    }
    response.setHeader("Cache-Control", "no-cache");
    response.setHeader("Pragma", "no-cache");
    request.setAttribute("customers", customers);
    String format = request.getParameter("format");
    String outputPage;
    if ("xml".equals(format)) {
      response.setContentType("text/xml");
      outputPage = "/WEB-INF/results/customers-xml.jsp";
    } else if ("json".equals(format)) {
      response.setContentType("text/javascript");
      outputPage = "/WEB-INF/results/customers-json.jsp";
    } else {
      response.setContentType("text/plain");
      outputPage = "/WEB-INF/results/customers-string.jsp";
    }
    RequestDispatcher dispatcher =
      request.getRequestDispatcher(outputPage);
    dispatcher.include(request, response);
  }
  
  public void doPost(HttpServletRequest request,
                     HttpServletResponse response)
      throws ServletException, IOException {
    doGet(request, response);
  }
  
  protected String[] getIDs(HttpServletRequest request) {
    String[] ids = { "missing", "missing" };
    for(int i=0; i<ids.length; i++) {
      String id = request.getParameter("id" + (i+1));
      if (!isEmpty(id)) { ids[i] = id; }
    }
    return(ids);
  }
  
  private boolean isEmpty(String value) {
    return((value == null) || (value.trim().equals("")));
  }
}
