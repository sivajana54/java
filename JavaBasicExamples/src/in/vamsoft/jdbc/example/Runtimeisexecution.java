package in.vamsoft.jdbc.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Runtimeisexecution {

  /**The run time input query example program.
   * @param args.
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("pls enter query");
    String input = sc.nextLine();
    sc.close();
    PreparedStatement preparedstatement = null;
    try {
      Connection con = DBConnectionUtil.getConnection();
      Statement st = con.createStatement();
      ResultSet rs = st.executeQuery(input);
      if (rs != null) {
        while (rs.next()) {
          System.out.println(
              rs.getInt("ID") + "\t" + rs.getString("FIRST") 
                                + "\t" + rs.getString("Last")  
                                    + "\t" + rs.getInt("AGE"));

        }
      } else {

        System.out.println("pls select proper query");
      }

    } catch (Exception e) {
      System.out.println("error");
    }

  }
}
