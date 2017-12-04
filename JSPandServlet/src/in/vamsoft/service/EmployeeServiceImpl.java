package in.vamsoft.service;

import java.util.List;

import in.vamsoft.dao.EmployeeDao;
import in.vamsoft.dao.EmployeeDaoImpl;
import in.vamsoft.model.Department;
import in.vamsoft.model.Employee;

public class EmployeeServiceImpl implements Service {

  @Override
  public List<Department> getAllDepartment() {
    EmployeeDaoImpl dao = new EmployeeDaoImpl();
    
    return null;
  }

  @Override
  public List<Employee> getAllEmployee(int deptId) {
    // TODO Auto-generated method stub
    return null;
  }

}
