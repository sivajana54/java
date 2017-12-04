package in.vamsoft.jdbc.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class MetadatafeaturesofJDBC {

  public static void main(String[] args) {
    try {

      Connection con = DBConnectionUtil.getConnection();
      Statement st = con.createStatement();

      PreparedStatement ps = con.prepareStatement("select * from employees");
      ResultSet rs = ps.executeQuery();
      ResultSetMetaData rsmd = rs.getMetaData();

      System.out.println("Total columns: " + rsmd.getColumnCount());
      System.out.println("Column Name of 1st column: " + rsmd.getColumnName(1));
      System.out.println("Column Type Name of 1st column: " + rsmd.getColumnTypeName(1));

      System.out.println("Column Name of 2nd column: " + rsmd.getColumnName(2));
      System.out.println("Column Type Name of 2nd column: " + rsmd.getColumnTypeName(2));

      System.out.println("Column Name of 3rd column: " + rsmd.getColumnName(3));
      System.out.println("Column Type Name of 3rd column: " + rsmd.getColumnTypeName(3));

      System.out.println("Column Name of 4th column: " + rsmd.getColumnName(4));
      System.out.println("Column Type Name of 4th column: " + rsmd.getColumnTypeName(4));

      System.out.println("Column Name of 5th  column: " + rsmd.getColumnName(5));
      System.out.println("Column Type Name of 5th  column: " + rsmd.getColumnTypeName(5));

      System.out.println("Column Name of 6th  column: " + rsmd.getColumnName(6));
      System.out.println("Column Type Name of 6th  column: " + rsmd.getColumnTypeName(6));

      System.out.println("Column Name of 7th  column: " + rsmd.getColumnName(7));
      System.out.println("Column Type Name of 7th  column: " + rsmd.getColumnTypeName(7));

      System.out.println("Column Name of 8th  column: " + rsmd.getColumnName(8));
      System.out.println("Column Type Name of 8th  column: " + rsmd.getColumnTypeName(8));

      System.out.println("Column Name of 9th  column: " + rsmd.getColumnName(9));
      System.out.println("Column Type Name of 9th  column: " + rsmd.getColumnTypeName(9));

      System.out.println("Column Name of 10th  column: " + rsmd.getColumnName(10));
      System.out.println("Column Type Name of 10th  column: " + rsmd.getColumnTypeName(10));

      System.out.println("Column Name of 11th  column: " + rsmd.getColumnName(11));
      System.out.println("Column Type Name of 11th column: " + rsmd.getColumnTypeName(11));

      con.close();
    } catch (Exception e) {
      System.out.println(e);
    }

  }

}
