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

import in.vamsoft.training.model.Product;

/**
 * Servlet implementation class CartServlet
 */
@WebServlet("/CartServlet")
public class CartServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * @see HttpServlet#HttpServlet()
   */
  public CartServlet() {
    super();
    // TODO Auto-generated constructor stub
  }

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
   *      response)
   */
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    System.out.println("inside the CartServlet");
    HttpSession session;
    session = request.getSession();
    List<Product> product = (List<Product>) session.getAttribute("ProductDetailsInformation");

    for (Product productselect : product) {

      String[] bookedProduct = request.getParameterValues(productselect.getProductName());

      System.out.println("bookproduct--------->"+bookedProduct);
      session = request.getSession();
      session.setAttribute("BookedProductItem", bookedProduct);
    
      RequestDispatcher dispatcher = request.getRequestDispatcher("Cart.jsp");
      dispatcher.forward(request, response);

    }

  }
}
