package in.vamsoft.training.model;

import java.sql.Date;
import java.time.LocalDate;

public class PaginationEmployee {
  int employeeId;
  String firstName;
  String lastName;
  String email;
  String phoneNumber;
  Date hireDate;
  String jobId;
  int salary;
  int commisionPct;
  int managerId;
  int departmentId;

  public PaginationEmployee() {
    super();
    // TODO Auto-generated constructor stub
  }

  public PaginationEmployee(int employeeId, String firstName, String lastName, String email, String phoneNumber,
      Date hireDate, String jobId, int salary, int commisionPct, int managerId, int departmentId) {
    super();
    this.employeeId = employeeId;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.phoneNumber = phoneNumber;
    this.hireDate = hireDate;
    this.jobId = jobId;
    this.salary = salary;
    this.commisionPct = commisionPct;
    this.managerId = managerId;
    this.departmentId = departmentId;
  }

  public int getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(int employeeId) {
    this.employeeId = employeeId;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public Date getHireDate() {
    return hireDate;
  }

  public void setHireDate(Date date) {
    this.hireDate = date;
  }

  public String getJobId() {
    return jobId;
  }

  public void setJobId(String jobId) {
    this.jobId = jobId;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public int getCommisionPct() {
    return commisionPct;
  }

  public void setCommisionPct(int commisionPct) {
    this.commisionPct = commisionPct;
  }

  public int getManagerId() {
    return managerId;
  }

  public void setManagerId(int managerId) {
    this.managerId = managerId;
  }

  public int getDepartmentId() {
    return departmentId;
  }

  public void setDepartmentId(int departmentId) {
    this.departmentId = departmentId;
  }

}
