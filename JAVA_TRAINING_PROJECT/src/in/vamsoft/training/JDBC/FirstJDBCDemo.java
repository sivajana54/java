package in.vamsoft.training.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;

public class FirstJDBCDemo {
  public static Logger logger = Logger.getLogger(FirstJDBCDemo.class);

  public static void main(String[] args) {
    logger.info("Main Method executed start");
    Connection connection = null;
    Statement statement = null;
    ResultSet resultset = null;
    try {
      connection = DBConnectionUtil.getConnection();
      statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
      resultset = statement.executeQuery("select employee_id,fname,salary,doj,deptid from empsiva");
      ResultSetMetaData resultSetMetaData = resultset.getMetaData();
      int colcount = resultSetMetaData.getColumnCount();
      for (int i = 1; i <= colcount; i++) {
        System.out.println(resultSetMetaData.getColumnName(i) + "\t\t");
      }
      System.out.println();
      while (resultset.next()) {

        System.out.println(resultset.getInt("employee_id") + "\t\t");
        System.out.println(resultset.getString("fname") + "\t\t");
        System.out.println(resultset.getDouble("salary") + "\t\t");
        System.out.println(resultset.getDate("doj") + "\t\t");
        System.out.println(resultset.getInt("deptid") + "\t\t");
        System.out.println();

      }
      System.out.println("going to back in the resultset");
      resultset.previous();
      System.out.println(resultset.getInt("employee_id") + "\t\t");
      System.out.println(resultset.getString("fname") + "\t\t");
      System.out.println(resultset.getDouble("salary") + "\t\t");
      System.out.println(resultset.getDate("doj") + "\t\t");
      System.out.println(resultset.getInt("deptid") + "\t\t");
      System.out.println();

      resultset.first();
      resultset.absolute(2);
      resultset.updateInt(5, 60);
      resultset.updateRow();
      System.out.println(resultset.getInt("employee_id") + "\t\t");
      System.out.println(resultset.getString("fname") + "\t\t");
      System.out.println(resultset.getDouble("salary") + "\t\t");
      System.out.println(resultset.getDate("doj") + "\t\t");
      System.out.println(resultset.getInt("deptid") + "\t\t");
      System.out.println();

    } catch (SQLException e) {

      logger.error("ERROR WHILE ESTABLISHING THE CONNECTION", e);
    } finally {
      try {
        connection.close();
        statement.close();
        DBConnectionUtil.closeconnection(connection);
      } catch (Exception e) {
        // TODO: handle exception
        logger.error("ERROR WHILE CLOSING THE CONNECTION", e);
      }
    }
  }

}
// url=jdbc\:oracle\:thin\:@192.168.10.77\:1521\:xe