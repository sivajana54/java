package in.vamsoft.exercise.domain.mainclass;

import in.vamsoft.exercise.domain.Admin;
import in.vamsoft.exercise.domain.Director;
import in.vamsoft.exercise.domain.Employee;
import in.vamsoft.exercise.domain.Engineer;
import in.vamsoft.exercise.domain.Manager;

public class EmployeeTest {

  public static void printEmployee(Employee emp) {

    System.out.println(emp);

  }

  public static void main(String[] args) {

    Engineer  enginner = new  Engineer(101, "JaneSmith", "012-34- 5678", 120_345.27);
    Manager manager = new Manager(207, "Barbara Johnson", "054-12- 2367", 109_501.36, "US Marketing");
    Admin admin = new Admin(304, "Bill Monroe", "108-23- 6509", 75_002.34);
    Director director = new Director(12, "Susan Wheeler", "099-45- 2340", 120_567.36, "Global Marketing", 1_000_000.00);

    System.out.println("Manager Properties Print");
    printEmployee(manager);
    System.out.println("");

    System.out.println("enginner Properties Print");
    printEmployee(enginner);
    System.out.println("");

    System.out.println("director Properties Print");
    printEmployee(director);
    System.out.println("");

    System.out.println("admin Properties Print");
    printEmployee(admin);
    System.out.println("");
   
    
    manager.raiseSalary(7000);
    System.out.println(manager);
    System.out.println("");
    
    manager.setNameRule(null);
    System.out.println(manager);
    System.out.println("");
    
    manager.setName("");
    System.out.println(manager);
    System.out.println("");
    
    manager.raiseSalary(700000);
    manager.setName("siva");
    System.out.println(manager);
    System.out.println("");
    
    Manager mnn = new Manager();
    mnn.addEmployee(1, "siva", "123", 54564);
    mnn.addEmployee(2, "jana", "456", 54564);
    mnn.addEmployee(3, "bala", "789", 54564);
    mnn.findemployee(3);
    mnn.printManagerDetails();
    

  }

}