package in.vamsoft.training.onlineshoping;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class BillAmountServlet
 */
public class BillAmountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BillAmountServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    ServletConfig config;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 HttpSession session =request.getSession();
      Object username=session.getAttribute("username");
      
      PrintWriter out =response.getWriter();
      if(username==null) {
        response.sendRedirect("login.html");
      }else {
        String uname =username.toString();
        Map<String,Integer> billmap =(Map<String,Integer>) session.getAttribute("bookedItems");
        double amount=0.0;
        for(Map.Entry<String, Integer> entry :billmap.entrySet()) {
          out.println(entry.getKey()+""+entry.getValue());
          amount+=entry.getValue();
        }
        String name = (String) request.getParameter("username");
        String[] select=request.getParameterValues("bookedItems");
        
        
	
      
        ServletContext context =this.getServletContext(); 
      String discount=context.getInitParameter("Discount");
     double discountamount =Double.parseDouble(discount);
      response.getWriter().append("<html><body><h7> Your DiscountAmount is:"+discountamount+"</h7></body></html>");
      
      ServletContext contexts =this.getServletContext();
      String gst=contexts.getInitParameter("GST");
     double gstamount =Double.parseDouble(gst);
      response.getWriter().append("<html><body><h7> Your GstAmount is:"+gstamount+"</h7></body></html>");
  
    double discountcalculated=discountamount*amount;
      double gstAmountcalculated=gstamount*amount;
      double totaldiscountamount= amount-discountcalculated;
      double  totalamount =totaldiscountamount+gstAmountcalculated;
      out.println("The Total Amount Is:"+totalamount);
      
     
      
      }
      session =request.getSession();
      
      if(username==null) {
        response.sendRedirect("login.html");
      }else {
        String uname =username.toString();
        
        out.println("<a href='LogoutServlet'>logout</a>");
        out.println("</h1></body></html>");
      }


}
}
