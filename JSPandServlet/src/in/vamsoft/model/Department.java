package in.vamsoft.model;

public class Department {
  int DEPARTMENT_ID;
  String DEPARTMENT_NAME;
  public int getDEPARTMENT_ID() {
    return DEPARTMENT_ID;
  }
  public void setDEPARTMENT_ID(int dEPARTMENT_ID) {
    DEPARTMENT_ID = dEPARTMENT_ID;
  }
  public String getDEPARTMENT_NAME() {
    return DEPARTMENT_NAME;
  }
  public void setDEPARTMENT_NAME(String dEPARTMENT_NAME) {
    DEPARTMENT_NAME = dEPARTMENT_NAME;
  }
  public Department() {
    super();
    // TODO Auto-generated constructor stub
  }
  @Override
  public String toString() {
    return "Department [DEPARTMENT_ID=" + DEPARTMENT_ID + ", DEPARTMENT_NAME=" + DEPARTMENT_NAME + "]";
  }

}
