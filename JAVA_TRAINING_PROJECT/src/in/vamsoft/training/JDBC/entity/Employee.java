package in.vamsoft.training.JDBC.entity;

import java.time.LocalDate;

public class Employee {
  int employee_id;
  String fname;
  double salary;
  LocalDate doj;
  int deptid;
 

  public int getEmployee_id() {
    return employee_id;
  }

  public Employee() {
    super();
    // TODO Auto-generated constructor stub
  }

  public void setEmployee_id(int employee_id) {
    this.employee_id = employee_id;
  }

  public String getFname() {
    return fname;
  }

  public void setFname(String fname) {
    this.fname = fname;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public int getDeptid() {
    return deptid;
  }

  public void setDeptid(int deptid) {
    this.deptid = deptid;
  }

  public LocalDate getDoj() {
    return doj;
  }

  public void setDoj(LocalDate doj) {
    this.doj = doj;
  }

  public Employee(int employee_id, String fname, double salary, int deptid, LocalDate doj) {
    super();
    this.employee_id = employee_id;
    this.fname = fname;
    this.salary = salary;
    this.deptid = deptid;
    this.doj = doj;
  }

  @Override
  public String toString() {
    return "Employee [employee_id=" + employee_id + ", fname=" + fname + ", salary=" + salary + ", deptid=" + deptid
        + ", doj=" + doj + "]";
  }

}
