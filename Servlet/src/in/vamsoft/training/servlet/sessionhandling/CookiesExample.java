package in.vamsoft.training.servlet.sessionhandling;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookiesExample
 */
public class CookiesExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookiesExample() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	  Cookie cookies[] =request.getCookies();
	  String name="";
	  String colour="";
	  if(cookies!=null) {
	    for(Cookie c:cookies) {
	      if(c.getName().equals("name")) {
	        name=c.getValue();
	      }
	      if(c.getName().equals("colour")) {
	        colour=c.getValue();
	      }
	    }
	    
	  }
	  PrintWriter out = response.getWriter();
	      out.println("<html><body bgcolor='"+colour+"'><h1>Welcome"+name+"</h1></body></html>");;
	}

}
