package in.vamsoft.jdbc.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class MetaData {

  /** Resultset MetaData Program.
   * @param args.
   */
  public static void main(String[] args) {
    Connection connection = null;
    connection = DBConnectionUtil.getConnection();
    try {
      Statement statement = connection.createStatement();
      ResultSet resultSet = statement.executeQuery("select * from REGISTER");
      ResultSetMetaData metaData = resultSet.getMetaData();
      System.out.println(metaData.getColumnCount());
      System.out.println(metaData.getColumnName(1));
      System.out.println(metaData.getColumnName(2));
      System.out.println(metaData.getColumnName(3));
      System.out.println(metaData.getColumnName(4));

     
      System.out.println(metaData.getColumnTypeName(1));
      System.out.println(metaData.getColumnTypeName(2));
      System.out.println(metaData.getColumnTypeName(3));
      System.out.println(metaData.getColumnTypeName(4));
      

    } catch (SQLException e) {
      e.printStackTrace();
    }

  }

}
