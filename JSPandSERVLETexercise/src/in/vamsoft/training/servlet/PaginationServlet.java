package in.vamsoft.training.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import in.vamsoft.training.dao.PaginationDao;
import in.vamsoft.training.dao.ProductDao;
import in.vamsoft.training.dao.ProductDaoImpl;
import in.vamsoft.training.model.PaginationEmployee;
import in.vamsoft.training.model.Product;

/**
 * Servlet implementation class PaginationServlet
 */
@WebServlet("/PaginationServlet")
public class PaginationServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * @see HttpServlet#HttpServlet()
   */
  public PaginationServlet() {
    super();
    // TODO Auto-generated constructor stub
  }

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
   *      response)
   */
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    System.out.println("inside the paginationservlet");
    HttpSession session;
    PaginationDao dao = new PaginationDao();
    List<PaginationEmployee> employee = dao.getPageForPagination();
    session = request.getSession();
    session.setAttribute("Pagination", employee);
  
    RequestDispatcher dispatcher = request.getRequestDispatcher("pagination.jsp");
    dispatcher.forward(request, response);
  }

}
