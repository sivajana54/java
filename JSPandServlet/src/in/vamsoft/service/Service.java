package in.vamsoft.service;

import java.util.List;

import in.vamsoft.model.Department;
import in.vamsoft.model.Employee;

public interface Service {
  public List<Department> getAllDepartment();

  List<Employee> getAllEmployee(int deptId);
}
