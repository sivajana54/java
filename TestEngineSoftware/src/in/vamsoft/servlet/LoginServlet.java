package in.vamsoft.servlet;

import in.vamsoft.dao.UserDao;
import in.vamsoft.training.model.UserModel;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  public LoginServlet() {
    super();
  }

  protected void doPost(HttpServletRequest request, HttpServletResponse response) 
                                                throws ServletException, IOException {
    try {

      UserModel user = new UserModel();
      String uname = request.getParameter("userName");
      String password = request.getParameter("password");
      user.setUserName(uname);
      user.setPassword(password);

      if (uname.equals("admin") && password.equals("admin")) {
        user = UserDao.admin(user);
        if (user.isValid()) {

          HttpSession session = request.getSession(true);
          session.setAttribute("currentSessionUser", uname);
          RequestDispatcher rd = request.getRequestDispatcher("QuestionServlet");
          rd.forward(request, response);

        } else {
          response.sendRedirect("invalidLogin.jsp");
        }

      } else {
        user = UserDao.login(user);
      }
      if (user.isValid()) {

        HttpSession session = request.getSession(true);
        session.setAttribute("currentSessionUser", uname);

        RequestDispatcher rd = request.getRequestDispatcher("QuestionServlet");
        rd.forward(request, response);
      } else {
        response.sendRedirect("invalidLogin.jsp");
      }
    } catch (Throwable theException) {
      System.out.println(theException);
    }
  }
}
