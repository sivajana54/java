package in.vamsoft.training.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class JDBCUpdateExample {
  public static Logger logger = Logger.getLogger(JDBCUpdateExample.class);

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("pls enter the id");
    int employee_id = sc.nextInt();

    Scanner sc1 = new Scanner(System.in);
    System.out.println("pls emter the salary");
    int amount = sc1.nextInt();
    logger.info("Main Method executed start");
    Connection connection = null;
    connection = DBConnectionUtil.getConnection();
    PreparedStatement preparedstatement = null;
    try {

      preparedstatement = connection.prepareStatement("update empsiva set salary=salary+? where employee_id=?");
      preparedstatement.setInt(1, amount);
      preparedstatement.setInt(2, employee_id);
      int update = preparedstatement.executeUpdate();
      System.out.println(update);
    } catch (SQLException e) {
      logger.error("error");
    }
DBConnectionUtil.closeconnection(connection);
  }

}
