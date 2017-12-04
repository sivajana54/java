package testPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import coreservlets.ServletUtilities;

/**
 * Servlet implementation class TestServlet2
 */
@WebServlet("/TestServlet2")
public class TestServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    String title = "Test Servlet with Utilities";
	    out.println
	      (ServletUtilities.headWithTitle(title) +
	       "<body bgcolor=\"#fdf5e6\">\n" +
	       "<h1>" + title + "</h1>\n" +
	       "<p>Simple servlet for testing.</p>\n" +
	       "</body></html>");
	}

}
