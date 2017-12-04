package in.vamsoft.training.JDBC.entity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Batchinsert {

  public static void main(String[] args) {
    try (Connection con = DBConnectionUtil.getConnection();
        PreparedStatement ps = con.prepareStatement("insert into empcopy values(?,?,?,?,?)");
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in)) {
      String ans = "no";
      do {
        System.out.println("Enter id");
        int id = sc1.nextInt();
        System.out.println("enter name");
        String name = sc2.nextLine();
        System.out.println("enter salary");
        double salary = sc1.nextDouble();
        System.out.println("enter the DOJ format dd-MM-yyyy");
        String doj = sc2.nextLine();
        System.out.println("enter the depart id");
        int deptid = sc1.nextInt();

        LocalDate localdate = LocalDate.parse(doj, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        java.sql.Date hireDate = java.sql.Date.valueOf(localdate);

        ps.setInt(1, id);
        ps.setString(2, name);
        ps.setDouble(3, salary);
        ps.setDate(4, hireDate);
        ps.setInt(5, deptid);
        ps.addBatch();
        System.out.println("insert more click row?(yes/no)");
        ans = sc2.next();
      } while (ans.equalsIgnoreCase("yes"));
      int[] rows = ps.executeBatch();
      for (int row : rows) {
        if (row != 0)
          System.out.println(row + "insert sucess");
        else
          System.out.println("not insert");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

}
