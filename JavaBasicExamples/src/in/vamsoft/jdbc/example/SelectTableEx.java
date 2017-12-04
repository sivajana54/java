package in.vamsoft.jdbc.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;

public class SelectTableEx {
  public static Logger log = Logger.getLogger(SelectTableEx.class);

  /**
   * The Program For JDBC Select Table Example.
   * 
   * @param args.
   */
  public static void main(String[] args) {
    log.info("main method execution started");
    try {

      Connection con = DBConnectionUtil.getConnection();
      System.out.println(con);
      Statement st = con.createStatement();
      ResultSet rs = st.executeQuery("select employee_id,first_name,salary from employees");
      while (rs.next()) {
        System.out.println(
            rs.getInt("EMPLOYEE_ID") + "\t" 
            + rs.getString("FIRST_NAME") + "\t" 
            + rs.getDouble("SALARY") + "\t");
      }
    } catch (SQLException e) {

      log.error("query not executed", e);
    }
  }
}