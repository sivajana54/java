package in.vamsoft.jdbc.example;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;

public class CreateTableEx {
  public static Logger log = Logger.getLogger(CreateTableEx.class);

  /**
   * The Program for CreateTable By using Java.
   * 
   * @param args.
   */
  public static void main(String[] args) {
    log.info("main method execution started");
    try {
      Connection con = DBConnectionUtil.getConnection();
      log.info(con);
      PreparedStatement prepared = con.prepareStatement(
                  "create table Register (id  number(5),"
                  + "first varchar2(100),"
                  + "last varchar2(100),age number(5))");
      prepared.executeUpdate();
      int rs = prepared.executeUpdate();

      /*
       * PreparedStatement preparedStatement =
       * con.prepareStatement("insert into Register values(?,?,?,?)");
       * preparedStatement.setInt(1, 100); preparedStatement.setString(2, "siva");
       * preparedStatement.setString(3, "jana"); preparedStatement.setInt(4, 22);
       * preparedStatement.executeUpdate(); int rs1 =
       * preparedStatement.executeUpdate();
       */
      con.close();
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      log.error("ERROR WHILE ESTABLISHING THE CONNECTION", e);
      e.printStackTrace();
    }
  }
}
