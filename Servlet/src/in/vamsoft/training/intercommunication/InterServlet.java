package in.vamsoft.training.intercommunication;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oracle.net.aso.r;

/**
 * Servlet implementation class InterServletCommunication
 */
//@WebServlet("/InterServletCommunication")
public class InterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname =request.getParameter("uname");
		String psw =request.getParameter("psw");
		
		PrintWriter out = response.getWriter();
	if(uname.equals("admin")&& psw.equals("admin")) {
	  response.sendRedirect("Sucess.html");
	}
	else {
       out.println("<h1>Validation Here!<h1>");
       RequestDispatcher rqstdis = request.getRequestDispatcher("ErrorServlet");
       rqstdis.forward(request, response);
	}
	}

}
