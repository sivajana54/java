package in.vamsoft.training.general;

public class Employee {

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + empid;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Employee other = (Employee) obj;
    if (empid != other.empid)
      return false;
    return true;
  }

  int empid;
  String empname;
  double empsalary;

  public Employee(int empid, String empname) {
    this(empid, empname, 2000);
  }

  public Employee(int empid, String empname, double empsalary) {
    super();
    this.empid = empid;
    this.empname = empname;
    this.empsalary = empsalary;
  }

  public String getEmpname() {
    return empname;
  }

  public void setEmpname(String empname) {
    this.empname = empname;
  }

  public int getEmpid() {
    return empid;
  }

  public double getEmpsalary() {
    return empsalary;
  }

  public void raisesalary(double raise) {
    if (raise >= this.empsalary * 0.10) {
      this.empsalary = empsalary + 10000;
    } else {
      System.out.println("cannot incred");
    }
  }
}
