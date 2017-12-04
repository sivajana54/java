package in.vamsoft.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

/**
 * Servlet implementation class Loginservlet
 */
@WebServlet("/Loginservlet")
public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 public static Logger logger = Logger.getLogger(Loginservlet.class);
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Loginservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  String username =request.getParameter("username");
	    String password =request.getParameter("password");
	    
	    PrintWriter out =response.getWriter();
	    HttpSession session =request.getSession();
	   
	    if(username.equals("siva")&&password.equals("jana"))
	    {
	      session.setAttribute("username", username);
	      RequestDispatcher reqdis = request.getRequestDispatcher("Servlet1");
	      reqdis.forward(request, response);
	      logger.info("the username and password are valid");
	}else {
	  RequestDispatcher reqdis = request.getRequestDispatcher("index.html");
      reqdis.forward(request, response);
      logger.info("the username and password are  not valid");
	}
	}
}
