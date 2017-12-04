package in.vamsoft.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InitParmTestServlet
 */
public class InitParmTestServlet extends HttpServlet {
	
	String CoName;
	ServletConfig config;
	@Override
  public void init(ServletConfig config) throws ServletException {
    // TODO Auto-generated method stub
    this.config=config;
    CoName=config.getInitParameter("companyName");
  }

  private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InitParmTestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		ServletContext context =config.getServletContext();
		String city=context.getInitParameter("city");
		out.print("<html><body><h1>"+CoName+""+city+"</h1></body></html>");
	}

}
