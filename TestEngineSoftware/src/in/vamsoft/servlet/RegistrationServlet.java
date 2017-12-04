package in.vamsoft.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import in.vamsoft.training.Dao.UserDao;
import in.vamsoft.training.model.UserModel;


@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  protected void doPost(HttpServletRequest request, HttpServletResponse response) 
                                           throws ServletException, IOException {
    System.out.println("inside the reg");
    
    HttpSession session = request.getSession();
    PrintWriter out = response.getWriter();

    String userName = request.getParameter("userName");
    System.out.println(userName);
    String password = request.getParameter("password");
    System.out.println(password);

    UserModel model = new UserModel(userName, password);
    new UserDao().reg(model);

    out.print("sucess");
    response.sendRedirect("index.jsp");

  }
}
