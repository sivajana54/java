package in.vamsoft.dao;

import in.vamsoft.training.dbutil.DbconnectionUtil;
import in.vamsoft.training.model.ModelQuestion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class QuestionDao {
  /**
   * The Connection can be connect.
   */
  Connection connection = null;

  /** the QuestionDao For question Selection.
   * 
   */
  public QuestionDao() {

    connection = DbconnectionUtil.getConnection();

  }

  /** THis is the method for get Question.
   * @return this method return list of question.
   */
  public List<ModelQuestion> getQuestions() {

    List<ModelQuestion> list = new ArrayList<>();
    try (PreparedStatement ps = connection.prepareStatement("select * from ModelQuestion")) {
      ResultSet rs = ps.executeQuery();
      ModelQuestion e = null;
      /* int questionNo = 1; */
      while (rs.next()) {
        e = new ModelQuestion();
        e.setQuestionNo(rs.getInt(1));
        System.out.println(rs.getInt(1));
        e.setQuestion(rs.getString(2));
        e.setOption1(rs.getString(3));
        e.setOption2(rs.getString(4));
        e.setOption3(rs.getString(5));
        e.setOption4(rs.getString(6));
        /* questionNo++; */
        list.add(e);
      }
      return list;

    } catch (SQLException e) {
      e.printStackTrace();
    }
    return null;
  }

  /**
   * @param correctAnswer.
   * @param question.
   * @return.
   */
  public boolean getAnswers(String correctAnswer, String question) {
    try (PreparedStatement preparedStatement = connection
        .prepareStatement("select question,correctAnswer from ModelQuestion")) {

      ResultSet rs = preparedStatement.executeQuery();

      while (rs.next()) {
        if (question.equals(rs.getString(1)) && correctAnswer.equals(rs.getString(2))) {
          return true;
        }
      }

    } catch (SQLException e) {
      e.printStackTrace();
    }

    return false;

  }

}
