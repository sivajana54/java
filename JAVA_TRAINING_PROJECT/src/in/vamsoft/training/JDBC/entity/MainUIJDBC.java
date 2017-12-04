package in.vamsoft.training.JDBC.entity;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.apache.log4j.Logger;

import in.vamsoft.training.JDBC.FirstJDBCDemo;

public class MainUIJDBC {
  public static Logger logger = Logger.getLogger(FirstJDBCDemo.class);

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    EmployeeDAO dao = EmployeeDAOFactory.getEmployeeDAO();
    BufferedReader breader = new BufferedReader(new InputStreamReader(System.in));

    try {
      System.out.println("enter id");
      int employee_id = Integer.parseInt(breader.readLine());

      System.out.println("enter name");
      String fname = breader.readLine();

      System.out.println("enter salary");
      double salary = Double.parseDouble(breader.readLine());

      System.out.println("enter date");
      LocalDate doj = LocalDate.parse(breader.readLine(), DateTimeFormatter.ofPattern("dd-MM-yyy"));

      System.out.println("enter department");
      int deptid = Integer.parseInt(breader.readLine());
      
      
      Employee employee = new Employee(employee_id, fname, salary, deptid, doj);
    boolean insert = dao.add(employee);
      if (insert) {
        System.out.println("success");
      } else {
        System.out.println("fail");
      }
    } catch (Exception e) {

      logger.error("ERROR WHILE ESTABLISHING THE CONNECTION", e);
    }
 
  }

}
