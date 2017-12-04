package in.vamsoft.training.general;

public class EmployeeMain {

  public static void main(String[] args) {
    
    Employee emp = new Employee(1, "siva", 3000);
    System.out.println("before salary" + emp.empsalary);
    emp.raisesalary(300);
    System.out.println("after salary" + emp.empsalary);
  }

}
