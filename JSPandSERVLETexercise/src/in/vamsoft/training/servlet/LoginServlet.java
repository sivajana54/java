package in.vamsoft.training.servlet;

import in.vamsoft.training.dao.LoginDao;
import in.vamsoft.training.dao.LoginDaoImpl;
import in.vamsoft.training.model.UserInformation;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * Servlet implementation class LoginServlet.
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * @see HttpServlet#HttpServlet().
   */
  public LoginServlet() {
    super();
    // TODO Auto-generated constructor stub
  }

  /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
   *      response).
   */
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
                                  throws ServletException, IOException {
    // TODO Auto-generated method stub
    response.getWriter().append("Served at: ").append(request.getContextPath());
  }

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
   *      response).
   */
  protected void doPost(HttpServletRequest request, HttpServletResponse response) 
                                              throws ServletException, IOException {
    System.out.println("inside the LoginServlet");
    HttpSession session;
    String userName = request.getParameter("UserName");
    String password = request.getParameter("password");

    UserInformation userInformation = new UserInformation();

    userInformation.setUserName(userName);
    userInformation.setPassword(password);

    LoginDao loginDao = new LoginDaoImpl();
    String userValidate = loginDao.authenticateUser(userInformation);
    List<UserInformation> details = loginDao.getUserInformation();
    session = request.getSession();
    session.setAttribute("UserInformationDetails", details);

    if (userValidate.equals("SUCCESS")) {
      request.setAttribute("UserName", userName);

      request.getRequestDispatcher("/Home.jsp").forward(request, response);

    } else {
      request.setAttribute("errorMessage", userValidate);

      request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

  }

}
