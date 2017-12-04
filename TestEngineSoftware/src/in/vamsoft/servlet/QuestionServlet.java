package in.vamsoft.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import in.vamsoft.training.Dao.QuestionDao;
import in.vamsoft.training.model.ModelQuestion;

@WebServlet("/QuestionServlet")
public class QuestionServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  public QuestionServlet() {
    super();
    // TODO Auto-generated constructor stub
  }

  protected void doPost(HttpServletRequest request, HttpServletResponse response) 
                                           throws ServletException, IOException {
    HttpSession session;
    QuestionDao dao = new QuestionDao();
    List<ModelQuestion> questions = dao.getQuestions();
    session = request.getSession();
    session.setAttribute("ModelQuestion", questions);
    System.out.println(questions);
    RequestDispatcher dispatcher = request.getRequestDispatcher("UserDashboard.jsp");
    dispatcher.forward(request, response);
  }

}
