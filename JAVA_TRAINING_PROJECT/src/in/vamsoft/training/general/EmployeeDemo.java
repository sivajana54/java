package in.vamsoft.training.general;

public class EmployeeDemo {
  int empid;
  String empname;
  double empsalary;
  int age;

  public int getEmpid() {
    return empid;
  }

  public void setEmpid(int empid) {
    this.empid = empid;
  }

  public String getEmpname() {
    return empname;
  }

  public void setEmpname(String empname) {
    this.empname = empname;
  }

  public double getEmpsalary() {
    return empsalary;
  }

  public void setEmpsalary(double empsalary) {
    this.empsalary = empsalary;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public EmployeeDemo() {
    super();
    this.empid = empid;
    this.empname = empname;
    this.empsalary = empsalary;
    this.age = age;
  }

  public EmployeeDemo(int i, String string, double d, int j) {
    // TODO Auto-generated constructor stub
  }

}
