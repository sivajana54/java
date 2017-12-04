package in.vamsoft.training.servlet;

import in.vamsoft.training.dao.ProductDao;
import in.vamsoft.training.dao.ProductDaoImpl;
import in.vamsoft.training.model.Product;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * @see HttpServlet#HttpServlet()
   */
  public ProductServlet() {
    super();
    // TODO Auto-generated constructor stub
  }

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
   *      response)
   */
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    System.out.println("inside the productservlet");
    HttpSession session;
    ProductDao dao = new ProductDaoImpl();
    List<Product> product = dao.getProductInformation();
    session = request.getSession();
    session.setAttribute("ProductDetailsInformation", product);
  
    RequestDispatcher dispatcher = request.getRequestDispatcher("Product.jsp");
    dispatcher.forward(request, response);
    
  }

}
