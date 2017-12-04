package in.vamsoft.training.testcurd;

import java.util.Scanner;
class Check {
  public  Employee add() {
    System.out.println("inside add method");
    
    return null;

  }
  

  public  Employee delete() {
    System.out.println("inside delete method");
    return null;

  }

  public  Employee view() {
    System.out.println("inside view method");
    return null;

  }

  public static Employee update() {
    System.out.println("inside update method");
    return null;

  }
  
}

public class TestEmployee extends Check {

  public static void main(String[] args) {
    /*
     * Employee employee = new Employee(); Employee employee1 = new Employee(1,
     * "jana", "CEO"); employee.setId(2); employee.setName("siva");
     * employee.sEmployeeetDepartmentName("Admin"); System.out.println(employee1);
     * System.out.println(employee);
     */
    Check ck = new Check();
    

    System.out.println("The Following Option for Add/Delete/View/Update");
    System.out.println("1" + "--" + "AddEmployee");
    System.out.println("2" + "--" + "DeleteEmployee");
    System.out.println("3" + "--" + "ViewEmployee");
    System.out.println("4" + "--" + "UpdateEmployee");

    Scanner sc = new Scanner(System.in);
    System.out.println("Pls Enter The Your Option");
    int input = sc.nextInt();

    switch (input) {
    case 1:
      System.out.println("Your Option is" + ":" + input);
     ck.add();
      break;
    case 2:
      System.out.println("Your Option is" + ":" + input);
      ck. delete();
      break;
    case 3:
      System.out.println("Your Option is" + ":" + input);
      ck. view();
      break;
    case 4:
      System.out.println("Your Option is" + ":" + input);
      ck. update();
      break;
    default:
      System.out.println("Not in Correct Option pls Select the Correct one");

    }

  }
  
}
