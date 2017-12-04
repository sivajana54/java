package in.vamsoft.training.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import in.vamsoft.training.dbutil.DBConnectionUtil;
import in.vamsoft.training.model.ModelQuestion;

public class QuestionDao {
  /**
   * The Connection can be connect.
   */
  Connection Connection = null;

  /** the QuestionDao For question Selection.
   * 
   */
  public QuestionDao() {

    Connection = DBConnectionUtil.getConnection();

  }

  public List<ModelQuestion> getQuestions() {

    List<ModelQuestion> list = new ArrayList<>();
    try (PreparedStatement ps = Connection.prepareStatement("select * from ModelQuestion")) {
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
    try (PreparedStatement preparedStatement = Connection
        .prepareStatement("select Question,CorrectAnswer from ModelQuestion")) {

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
