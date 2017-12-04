import java.time.LocalDate;

public class Employee {
int empId;
String empName;
double salary;
LocalDate doj;
int deptid;
Address address;
public int getEmpId() {
  return empId;
}
public void setEmpId(int empId) {
  this.empId = empId;
}
public String getEmpName() {
  return empName;
}
public void setEmpName(String empName) {
  this.empName = empName;
}
public double getSalary() {
  return salary;
}
public void setSalary(double salary) {
  this.salary = salary;
}
public LocalDate getDoj() {
  return doj;
}
public void setDoj(LocalDate doj) {
  this.doj = doj;
}
public int getDeptid() {
  return deptid;
}
public void setDeptid(int deptid) {
  this.deptid = deptid;
}
public Address getAddress() {
  return address;
}
public void setAddress(Address address) {
  this.address = address;
}
public Employee(int empId, String empName, double salary, LocalDate doj, int deptid, Address address) {
  super();
  this.empId = empId;
  this.empName = empName;
  this.salary = salary;
  this.doj = doj;
  this.deptid = deptid;
  this.address = address;
}
public Employee() {
  super();
  // TODO Auto-generated constructor stub
}
@Override
public String toString() {
  return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", doj=" + doj + ", deptid="
      + deptid + ", address=" + address + "]";
}

}
