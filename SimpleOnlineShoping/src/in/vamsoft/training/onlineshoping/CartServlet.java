package in.vamsoft.training.onlineshoping;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CartServlet
 */
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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  HttpSession session =request.getSession();
      Object username=session.getAttribute("username");
      Map<String, Integer> book = new HashMap<>();
      book.put("java", 250);
      book.put("maths", 150);
      book.put("science", 200);
      book.put("tamil", 350);
      
      Map<String, Integer> mobile = new HashMap<>();
      mobile.put("moto", 25000);
      mobile.put("sony", 35000);
      mobile.put("lenavo", 25000);
      mobile.put("vivo", 20000);
      
      Map<String,Integer> dress =new HashMap<>();
      dress.put("pant", 500);
      dress.put("tshirt", 300);
      dress.put("jeans", 1200);
      dress.put("shirt", 750);
      
      Map<String ,Integer> bookedItem =new HashMap<>();
      
      PrintWriter out =response.getWriter();
      int selectedbook=0;
      int selectedMobile=0;
      int  selecteddress=0;
      if(username==null) {
        response.sendRedirect("login.html");
      }else {
        String uname =username.toString();
        String selectbook[]=request.getParameterValues("book");
        String selectmobile[]=request.getParameterValues("mobile");
        String selectdress[]=request.getParameterValues("dress");
        response.setContentType("text/html");
        for(String com:selectbook) {
            out.println("Select Item Are :"+com);
            if(book.containsKey(com)) {
              selectedbook=book.get(com);
                bookedItem.put(com, book.get(com));
                out.println(selectedbook);
            }else {
                out.println("your selected not in map");
            }
	}
        
        for(String com1:selectmobile) {
          out.println("Select Item Are :"+com1);
          if(mobile.containsKey(com1)) {
              selectedMobile=mobile.get(com1);
              bookedItem.put(com1, mobile.get(com1));
              out.println(selectedMobile);
          }else {
              out.println("your selected not in map");
          }
  }
        
        for(String com2:selectdress) {
          out.println("Select Item Are :"+com2);
          if(dress.containsKey(com2)) {
              selecteddress=dress.get(com2);
              bookedItem.put(com2, dress.get(com2));
              out.println(selecteddress);
          }else {
              out.println("your selected not in map");
          }
  }
      
      }
      session.setAttribute("bookedItems", bookedItem);
      RequestDispatcher reqdis = request.getRequestDispatcher("BillAmountServlet");
      reqdis.forward(request, response);
	}
}
	

