package in.vamsoft.training;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecoundInitServlet
 */
public class SecoundInitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	ServletConfig config;
  
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext context =config.getServletContext();
		String city=context.getInitParameter("city");
		response.getWriter().append("<html><body><h1>"+city+"</h1></body></html>");
		
	}

  @Override
  public void init(ServletConfig config) throws ServletException {
    // TODO Auto-generated method stub
    super.init(config);
    this.config=config;
  }

}
