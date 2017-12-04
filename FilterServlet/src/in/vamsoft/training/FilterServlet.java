package in.vamsoft.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

/**
 * Servlet Filter implementation class Servlet1
 */
@WebFilter("/Servlet1")

public class FilterServlet implements Filter {
  public static Logger logger = Logger.getLogger(Loginservlet.class);

  /**
   * Default constructor.
   */
  public FilterServlet() {
    // TODO Auto-generated constructor stub
  }

  /**
   * @see Filter#destroy()
   */
  public void destroy() {
    // TODO Auto-generated method stub
  }

  /**
   * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
   */
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
      throws IOException, ServletException {
    // TODO Auto-generated method stub
    // place your code here

    // pass the request along the filter chain
   /* String username = (String) request.getAttribute("username");
    String password = (String) request.getAttribute("password");
*/
    PrintWriter out = response.getWriter();

    String password = request.getParameter("password");
    if (password.equals("admin")) {
      RequestDispatcher r =request.getRequestDispatcher("Servlet1");
      chain.doFilter(request, response);// sends request to next resource
    } else {
      out.print("username or password error!");
      RequestDispatcher rd = request.getRequestDispatcher("index.html");
      rd.include(request, response);
      HttpSession session = ((HttpServletRequest) request).getSession();
      logger.info("Inside the filter");
    }

    chain.doFilter(request, response);
  }

  /**
   * @see Filter#init(FilterConfig)
   */
  public void init(FilterConfig fConfig) throws ServletException {

  }

}
