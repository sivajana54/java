package in.vamsoft.jdbc.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Insert {

  /**The program for insert continuous.
   * @param args.
   */
  public static void main(String[] args) {
    try (Connection con = DBConnectionUtil.getConnection();
        PreparedStatement ps = con.prepareStatement("insert into REGISTER values(?,?,?,?)");
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in)) {
      String ans = "no";
      do {
        System.out.println("Enter id");
        int id = sc1.nextInt();
        ps.setInt(1, id);
        System.out.println("enter first name");
        String firstname = sc2.nextLine();
        ps.setString(2, firstname);
        System.out.println("enter last name");
        String lastname = sc2.nextLine();
        ps.setString(3, lastname);
        System.out.println("enter the age");
        int age = sc1.nextInt();
        ps.setInt(4, age);
       
       
        
      

        ps.addBatch();
        System.out.println("insert more click row?(yes/no)");
        ans = sc2.next();
      } while (ans.equalsIgnoreCase("yes"));
      int[] rows = ps.executeBatch();
      for (int row : rows) {
        if (row != 0) {
          System.out.println(row + "insert sucess");
        } else {
          System.out.println("not insert");
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

}
