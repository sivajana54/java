package testPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    out.println
	      ("<!DOCTYPE html>\n" +
	       "<html>\n" +
	       "<head><title>A Test Servlet</title></head>\n" +
	       "<body bgcolor=\"#fdf5e6\">\n" +
	       "<h1>Test</h1>\n" +
	       "<p>Simple servlet for testing.</p>\n" +
	       "</body></html>");
	}
}
