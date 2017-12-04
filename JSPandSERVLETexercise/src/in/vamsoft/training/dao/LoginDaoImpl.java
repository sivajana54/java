package in.vamsoft.training.dao;

import in.vamsoft.training.databaseutil.DataBaseConnectionUtil;

import in.vamsoft.training.model.UserInformation;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

public class LoginDaoImpl implements LoginDao{
  public static Logger logger = Logger.getLogger(DataBaseConnectionUtil.class);

  /**
   * @param userInformation.
   * 
   */
  Connection con = null;
  Statement statement = null;
  ResultSet resultSet = null;
  public  LoginDaoImpl() {
   con = DataBaseConnectionUtil.getConnection();
  }
  
  /**
   * @param userInformation.
   * @return SUCCESS.
   */
  public String authenticateUser(UserInformation userInformation) {

    String userName = userInformation.getUserName();
    String password = userInformation.getPassword();
    
   
    String userNameDataBase = "";
    String passwordDataBase = "";
    try {
      con = DataBaseConnectionUtil.getConnection();
      statement = con.createStatement();
      resultSet = statement.executeQuery("select userName,password from UserInformation");
      while (resultSet.next()) {
        userNameDataBase = resultSet.getString("userName");
        passwordDataBase = resultSet.getString("password");
        if (userName.equals(userNameDataBase) && password.equals(passwordDataBase)) {
          return "SUCCESS";
        }

      }

    } catch (Exception e) {
      logger.error(e);
    }
    return "Invalid user credentials";
  }

  /**
   * @return list.
   */
  public List<UserInformation> getUserInformation() {
    List<UserInformation> list = new ArrayList<>();
    try {
        con = DataBaseConnectionUtil.getConnection();
        statement = con.createStatement();
        resultSet = statement.executeQuery("select firstName,lastName,email from UserInformation");
      UserInformation details = null;
      while (resultSet.next()) {
        details = new UserInformation();
        details.setFirstName(resultSet.getString(1));
        System.out.println(resultSet.getString(1));
        details.setLastName(resultSet.getString(2));
        details.setEmail(resultSet.getString(3));
       
        list.add(details);
      }
      return list;

    } catch (SQLException e) {
      e.printStackTrace();
    }
    return null;
  }
}
