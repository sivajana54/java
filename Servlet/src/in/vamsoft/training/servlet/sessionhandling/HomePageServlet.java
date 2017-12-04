package in.vamsoft.training.servlet.sessionhandling;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HomePageServlet
 */
public class HomePageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomePageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session =request.getSession();
		Object username=session.getAttribute("username");
		
		PrintWriter out =response.getWriter();
		if(username==null) {
		  response.sendRedirect("login.html");
		}else {
		  String uname =username.toString();
		  out.println("<html><body<h1>WELCOME"+uname);
		  out.println("<a href='TransferFunds'>transferFunds</a>");
		  out.println("</h1></body></html>");
		}
	}

}
