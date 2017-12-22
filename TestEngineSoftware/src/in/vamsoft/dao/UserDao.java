package in.vamsoft.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;

import in.vamsoft.training.dbutil.DbconnectionUtil;
import in.vamsoft.training.model.UserModel;

public class UserDao {
  public static Logger logger = Logger.getLogger(UserDao.class);
  static Connection Connection = null;
  static ResultSet rs = null;

  public static UserModel login(UserModel bean) {

    // preparing some objects for connection
    Statement stmt = null;

    String userName = bean.getUserName();
    String password = bean.getPassword();

    String searchQuery = "select * from uservalidation where USER_NAME='" + userName + "' AND PASSWORD='" + password
        + "'";

    // "System.out.println" prints in the console; Normally used to trace the
    // process
    System.out.println("Your user name is " + userName);
    System.out.println("Your password is " + password);
    System.out.println("Query: " + searchQuery);

    try {

      Connection = DbconnectionUtil.getConnection();
      stmt = Connection.createStatement();
      rs = stmt.executeQuery(searchQuery);
      boolean more = rs.next();

      // if user does not exist set the isValid variable to false
      if (!more) {
        System.out.println("Sorry, you are not a registered user! Please sign up first");
        bean.setValid(false);
      }

      // if user exists set the isValid variable to true
      else if (more) {
        System.out.println("in elseif loop");
        String username = rs.getString("USER_NAME");

        System.out.println("Welcome " + username);
        bean.setUserName(username);

        bean.setValid(true);
      }
    }

    catch (Exception ex) {
      System.out.println("Log In failed: An Exception has occurred! " + ex);
    }

    // some exception handling
    finally {
      if (rs != null) {
        try {
          rs.close();
        } catch (Exception e) {
        }
        rs = null;
      }

      if (stmt != null) {
        try {
          stmt.close();
        } catch (Exception e) {
        }
        stmt = null;
      }

      if (Connection != null) {
        try {
          Connection.close();
        } catch (Exception e) {
        }

        Connection = null;
      }
    }

    return bean;

  }

  public boolean reg(UserModel model) {

    System.out.println("inside the add method");
    Connection = DbconnectionUtil.getConnection();

    try (PreparedStatement preparedStatement = Connection
        .prepareStatement("insert into uservalidation(USER_NAME,PASSWORD )values(?,?)")) {

      System.out.println("inside the try block after query");

      preparedStatement.setString(1, model.getUserName());
      System.out.println(model.getUserName());
      preparedStatement.setString(2, model.getPassword());
      System.out.println(model.getPassword());
      int rowsUpdate = preparedStatement.executeUpdate();
      System.out.println(rowsUpdate);
      return rowsUpdate > 0 ? true : false;
    } catch (SQLException e) {
      logger.error("ERROR WHILE ESTABLISHING THE CONNECTION", e);
      e.printStackTrace();
    }
    return false;

  }

  public static UserModel admin(UserModel user) {
    Statement stmt = null;

    String userName = "admin";
    String password = "admin";

    String searchQuery = "select * from ADMIN where USER_NAME='" + userName + "' AND PASSWORD='" + password + "'";

    // "System.out.println" prints in the console; Normally used to trace the
    // process
    System.out.println("Your user name is " + userName);
    System.out.println("Your password is " + password);
    System.out.println("Query: " + searchQuery);

    try {

      Connection = DbconnectionUtil.getConnection();
      stmt = Connection.createStatement();
      rs = stmt.executeQuery(searchQuery);
      boolean more = rs.next();

      // if user does not exist set the isValid variable to false
      if (!more) {
        System.out.println("Sorry, you are not a registered user! Please sign up first");
        user.setValid(false);
      }

      // if user exists set the isValid variable to true
      else if (more) {
        System.out.println("in elseif loop");
        String username = rs.getString("USER_NAME");

        System.out.println("Welcome " + username);
        user.setUserName(username);

        user.setValid(true);
      }
    }

    catch (Exception ex) {
      System.out.println("Log In failed: An Exception has occurred! " + ex);
    }

    // some exception handling
    finally {
      if (rs != null) {
        try {
          rs.close();
        } catch (Exception e) {
        }
        rs = null;
      }

      if (stmt != null) {
        try {
          stmt.close();
        } catch (Exception e) {
        }
        stmt = null;
      }

      if (Connection != null) {
        try {
          Connection.close();
        } catch (Exception e) {
        }

        Connection = null;
      }
    }

    return user;

  }

}
