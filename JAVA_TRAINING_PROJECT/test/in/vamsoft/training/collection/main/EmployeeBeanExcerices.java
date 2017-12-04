package in.vamsoft.training.collection.main;

public class EmployeeBeanExcerices {
  private static int employeeCounter;
  private int employeeId;
  private String employeeName;
  private double employeeSalary;

  public EmployeeBeanExcerices(String employeeName, double employeeSalary) {
    super();
    employeeCounter++;
    this.employeeId += employeeCounter;
    this.employeeName = employeeName;
    this.employeeSalary = employeeSalary;
  }

  public double getEmployeeSalary() {
    return employeeSalary;
  }

  public void setEmployeeSalary(double employeeSalary) {
    this.employeeSalary = employeeSalary;
  }

  public int getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(int employeeId) {
    this.employeeId = employeeId;
  }

  public String getEmployeeName() {
    return employeeName;
  }

  public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }

}
