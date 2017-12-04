package in.vamsoft.dao;

import java.util.List;

import in.vamsoft.model.Department;
import in.vamsoft.model.Employee;

public interface EmployeeDao {
public List<Department> getAllDepartment();

List<Employee> getAllEmployee(int deptId);


boolean add(Employee employee);
}
