package in.vamsoft.exercise.domain;

public class Employee {
  private int empId;
  private String name;
  private String ssn;
  private double salary;

  public Employee(int empId, String name, String ssn, double salary) {
    super();
    this.empId = empId;
    this.name = name;
    this.ssn = ssn;
    this.salary = salary;
  }

  public Employee() {
    super();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getEmpId() {
    return empId;
  }

  public String getSsn() {
    return ssn;
  }

  public double getSalary() {
    return salary;
  }

  public void raiseSalary(double raise) {

    if (raise >= this.salary * 0.10) {
      this.salary = salary + 500000;
    } else {
      System.out.println("cannot incresed ammount");
    }
  }

  public void setNameRule(String name) {

    if (name == null || name == "") {
      System.out.println("cannot be print name please give the invalid Name");
    } else {
      this.name = name;
    }
  }

  @Override
  public String toString() {
    return "Employee [empId=" + empId + ", name=" + name + ", ssn=" + ssn + ", salary=" + salary + "]";
  }
  
  public void printEmployee() {
    System.out.println("Employee id:"+getEmpId());
    System.out.println("Employee name:"+getName());
    System.out.println("Employee ssn:"+getSsn());
    System.out.println("Employee salary:"+getSalary());
  
}
}
