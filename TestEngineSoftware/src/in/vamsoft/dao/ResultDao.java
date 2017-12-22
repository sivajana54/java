package in.vamsoft.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ResultDao {

  /**
   * @param CorrectAnswer.
   * @param Question.
   * @return.
   */
  public boolean getAnswers(String CorrectAnswer, String Question) {
    Connection connection = null;
    try (@SuppressWarnings("null")
    PreparedStatement preparedStatement = connection
        .prepareStatement("select question,correctAnswer from ModelQuestion")) {

      ResultSet rs = preparedStatement.executeQuery();

      while (rs.next()) {
        if (Question.equals(rs.getString(2)) && CorrectAnswer.equals(rs.getString(7))) {
          return true;
        }
      }

    } catch (SQLException e) {
      e.printStackTrace();
    }

    return false;

  }

}
