package in.vamsoft.training.onlineshoping;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ErrorServlet
 */
public class ErrorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ErrorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  String uname =request.getParameter("username");
      PrintWriter out =response.getWriter();
      out.println("<h1 style=\"color:red;>Sorry"+""+uname+""+"Was not correct pls check it!</h1>");
      RequestDispatcher reqdis =request.getRequestDispatcher("login.html");
      reqdis.include(request, response);
  }

}
