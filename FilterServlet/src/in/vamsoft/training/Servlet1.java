package in.vamsoft.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

/**
 * Servlet implementation class servlet1
 */
@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet {
  
	private static final long serialVersionUID = 1L;
    public static Logger logger = Logger.getLogger(Servlet1.class);
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  PrintWriter out =response.getWriter();
      HttpSession session = request.getSession();
	  
	  logger.info("inside the Servlet1");
	}

}
