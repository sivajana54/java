package in.vamsoft.training.collection.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeManagementSystem {
  Map<Integer, EmployeeBeanExcerices> employeeMap = new HashMap<>();

  public boolean addEmployee(EmployeeBeanExcerices employee) {
    employeeMap.put(employee.getEmployeeId(), employee);
    displayEmployeeDetails();
    return true;
  }

  public boolean removeEmployee(int employeeId) {
    if (employeeMap.containsKey(employeeId)) {
      employeeMap.remove(employeeId);
      return true;
    }

    else {
      System.out.println("Invalid Employee Id");
      return false;
    }
  }

  public void displayEmployeeDetails() {

    if (employeeMap.isEmpty())
      System.out.println("Empty....");
    else {
      for (Map.Entry<Integer, EmployeeBeanExcerices> entry : employeeMap.entrySet()) {

        System.out.println("Employee Id    :" + entry.getValue().getEmployeeId());
        System.out.println("Employee Name  :" + entry.getValue().getEmployeeName());
        System.out.println("Employee Salary:" + entry.getValue().getEmployeeSalary());
      }
    }
  }

  public static void main(String[] args) {

    EmployeeManagementSystem ems = new EmployeeManagementSystem();
    String doContinue = "";
    System.out.println("Welcome to Employee Management System");
    System.out.println("--------------------------------------");
    do {
      System.out.println("1.Add Employee");
      System.out.println("2.Remove Employee");
      System.out.println("3.View Employee");
      System.out.println("4.Exit");

      System.out.println("Please Enter your Option");
      Scanner scanner = new Scanner(System.in);

      int option = scanner.nextInt();

      switch (option) {
      case 1:
        System.out.println("Enter Employee Details");
        System.out.println("1.Enter Employee Name:");
        String employeeName = scanner.next();
        System.out.println("2.Enter Employee Salary:");
        double employeeSalary = scanner.nextDouble();
        EmployeeBeanExcerices employee = new EmployeeBeanExcerices(employeeName, employeeSalary);
        ems.addEmployee(employee);

      case 2:
        System.out.println("Enter the Employee ID you want to delete");
        int employeeId = scanner.nextInt();
        ems.removeEmployee(employeeId);
        break;
      case 3:
        ems.displayEmployeeDetails();
        break;
      case 4:
        System.exit(0);
        break;
      default:
        System.out.println("Invalid Option");

      }
      System.out.println("Do you want to continue?(y/n)");
      doContinue = scanner.next();
    } while (doContinue.equalsIgnoreCase("y"));

  }
}
