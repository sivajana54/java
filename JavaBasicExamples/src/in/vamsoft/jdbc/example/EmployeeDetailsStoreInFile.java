package in.vamsoft.jdbc.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDetailsStoreInFile {

  /**select the employeename and store in file.
   * @param args.
   */
  public static void main(String[] args) {

    try {

      Connection con = DBConnectionUtil.getConnection();
      Statement st = con.createStatement();
      ResultSet rs = st.executeQuery("select UPPER(first_name)FROM employees");

      File file = new File("Employeefirstname.txt");
     

      FileOutputStream fop = new FileOutputStream(file);

    if (!file.exists()) {
        file.createNewFile();
      }

   
      while (rs.next()) {
        System.out.println(rs.getString(1));
        byte[] contentInBytes = rs.getString(1).getBytes();

        fop.write(contentInBytes);
        fop.write(System.getProperty("line.separator").getBytes());
      }
      fop.flush();
      fop.close();

      System.out.println("Done");

    } catch (FileNotFoundException e) {
      System.out.println("file not found");
    } catch (IOException e) {
      System.out.println("IOException");
      e.printStackTrace();
    } catch (SQLException e) {
      System.out.println("SQLException");
      e.printStackTrace();
    }

  }

}
