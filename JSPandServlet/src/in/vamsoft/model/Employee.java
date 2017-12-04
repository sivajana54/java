package in.vamsoft.model;

public class Employee {
 int EMPLOYEE_ID;
 String FIRST_NAME;
 Double SALARY;

public int getEMPLOYEE_ID() {
  return EMPLOYEE_ID;
}
public void setEMPLOYEE_ID(int eMPLOYEE_ID) {
  EMPLOYEE_ID = eMPLOYEE_ID;
}
public String getFIRST_NAME() {
  return FIRST_NAME;
}
public void setFIRST_NAME(String fIRST_NAME) {
  FIRST_NAME = fIRST_NAME;
}
public Double getSALARY() {
  return SALARY;
}
public void setSALARY(Double sALARY) {
  SALARY = sALARY;
}

public Employee() {
  super();
  // TODO Auto-generated constructor stub
}
@Override
public String toString() {
  return "Employee [EMPLOYEE_ID=" + EMPLOYEE_ID + ", FIRST_NAME=" + FIRST_NAME + ", SALARY=" + SALARY + "]";
}
public Employee(int eMPLOYEE_ID, String fIRST_NAME, Double sALARY) {
  super();
  EMPLOYEE_ID = eMPLOYEE_ID;
  FIRST_NAME = fIRST_NAME;
  SALARY = sALARY;
}
public Employee(int empId) {
  
}


}
