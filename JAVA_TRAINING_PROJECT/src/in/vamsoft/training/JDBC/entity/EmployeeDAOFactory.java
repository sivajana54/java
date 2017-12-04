package in.vamsoft.training.JDBC.entity;

public class EmployeeDAOFactory {
  public static EmployeeDAO getEmployeeDAO() {
    return new EmployeeJDBCImpl();
  }
}