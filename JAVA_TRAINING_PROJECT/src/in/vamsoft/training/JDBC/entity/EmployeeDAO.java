package in.vamsoft.training.JDBC.entity;

public interface EmployeeDAO {
  public boolean add(Employee employee);
  public boolean delete(int employee_id);
 // public boolean update();
  public Employee findEmployee(int employee_id);

}
