package coreservlets;

import javax.servlet.http.*;

public class CustomerList2 extends CustomerList {
  protected String[] getIDs(HttpServletRequest request) {
    String idString = request.getParameter("ids");
    String[] ids = {};
    if (idString != null) {
      idString = idString.trim();
      if (idString.length() > 0) {
        ids = idString.split("\\s+");
      }
    }
    return(ids);
  }
}
