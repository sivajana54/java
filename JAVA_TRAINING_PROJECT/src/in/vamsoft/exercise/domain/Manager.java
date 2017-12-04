package in.vamsoft.exercise.domain;

public class Manager extends Employee {
  private String deptName;

  public Manager(int empId, String name, String ssn, double salary, String deptName) {
    super(empId, name, ssn, salary);

  }

  public String getDeptName() {
    return deptName;
  }

  private Employee[] staff;
  private static int empCount;

  @SuppressWarnings("static-access")
  public Manager() {
    super();
    this.staff = new Employee[20];
    this.empCount = 0;

  }

  @SuppressWarnings("static-access")
  public boolean addEmployee(int empId, String name, String ssn, double salary) {
    this.staff[empCount] = new Employee(empId, name, ssn, salary);
    this.empCount++;
    return true;

  }

  public void findemployee(int emp) {
    System.out.println("Manager.findemployee()");

    for (int i = 0; i < 20; i++) {
      if (this.staff[i].getEmpId() == emp) {
        System.out.println("exists");
      } else {
        System.out.println("no");
      }
    }

  }

  public void printManagerDetails() {
    for (int i = 0; i < 20; i++) {
      this.staff[i].printEmployee();
    }
  }

}
