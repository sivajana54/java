package in.vamsoft.training.collection.main;

public class Employee {
  int empid;
  String empname;
  String address;
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
  
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }
  public Employee(int empid, String empname, String address) {
    super();
    this.empid = empid;
    this.empname = empname;
    this.address = address;
  }
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + empid;
    result = prime * result + ((empname == null) ? 0 : empname.hashCode());
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
    if (empname == null) {
      if (other.empname != null)
        return false;
    } else if (!empname.equals(other.empname))
      return false;
    return true;
  }
  public Employee() {
    super();
    // TODO Auto-generated constructor stub
  }
  @Override
  public String toString() {
    return "Employee [empid=" + empid + ", empname=" + empname + ", address=" + address + "]";
  }
}
