package in.vamsoft.training.onlineshoping;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ValidateDataUserServlet
 */
public class ValidateDataUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidateDataUserServlet() {
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
	      RequestDispatcher reqdis = request.getRequestDispatcher("catalog.html");
	      reqdis.forward(request, response);
	      
	    }
	    else {
	      RequestDispatcher reqdis =request.getRequestDispatcher("ErrorServlet");
	      reqdis.forward(request, response);
	    }
	}
}
