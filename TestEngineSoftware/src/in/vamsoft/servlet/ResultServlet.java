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

@WebServlet("/ResultServlet")
public class ResultServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  public ResultServlet() {
    super();
    // TODO Auto-generated constructor stub
  }

  protected void doPost(HttpServletRequest request, HttpServletResponse response) 
                                           throws ServletException, IOException {

    HttpSession session;

    session = request.getSession();

    int marks = 0;
    boolean result;

    List<ModelQuestion> questionList = (List<ModelQuestion>) session.getAttribute("ModelQuestion");

    for (ModelQuestion question : questionList) {

      String ans = request.getParameter(String.valueOf(question.getQuestionNo()));

      String ques = question.getQuestion();

      if (ans != null) {
        QuestionDao dao = new QuestionDao();
        result = dao.getAnswers(ans, ques);
        if (result) {
          marks++;
        }
      }
    }
    session.setAttribute("marks", marks);
    RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
    dispatcher.forward(request, response);
  }
}
