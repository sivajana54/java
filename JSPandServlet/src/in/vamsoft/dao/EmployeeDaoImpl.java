package in.vamsoft.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import in.vamsoft.model.Department;
import in.vamsoft.model.Employee;



public class EmployeeDaoImpl implements EmployeeDao {
  public static Logger logger = Logger.getLogger(EmployeeDaoImpl.class);

 Connection connection ;

 
  @Override
  public List<Department> getAllDepartment() {
   connection = DBConnectionUtil.getConnection();
 List<Department> depat = new ArrayList<>();
 try(PreparedStatement pre =connection.prepareStatement("select DEPARTMENT_ID,DEPARTMENT_NAME from departments");
     ResultSet rs =pre.executeQuery();){
   
   while(rs.next()) {
     Department depatment = new Department();
     depatment.setDEPARTMENT_ID(rs.getInt(1));
     depatment.setDEPARTMENT_NAME(rs.getString(2));
     depat.add(depatment);
   }
 } catch (SQLException e) {
 logger.error("error");
  e.printStackTrace();
}
    return depat;
  }


  @Override
  public List<Employee> getAllEmployee(int deptId) {
    connection = DBConnectionUtil.getConnection();
    List<Employee> emp = new ArrayList<>();
    try(PreparedStatement pre =connection.prepareStatement("select *from employees where DEPARTMENT_ID=?");){
    pre.setInt(1, deptId);
        ResultSet rs =pre.executeQuery();
      
      while(rs.next()) {
     Employee employee = new Employee();
     employee.setEMPLOYEE_ID(rs.getInt(1));
     employee.setFIRST_NAME(rs.getString(2));
     employee.setSALARY(rs.getDouble(8));
emp.add(employee);
      }
    } catch (SQLException e) {
    logger.error("error");
     e.printStackTrace();
   }
       return emp;
   


  }


  @Override
  public boolean add(Employee employee) {
    System.out.println("inside the add method");
    connection = DBConnectionUtil.getConnection();
    try (PreparedStatement preparedStatement = connection.prepareStatement("insert into empsiva(EMPLOYEE_ID,FIRST_NAME,SALARY) values(?,?,?)");) {
      System.out.println("inside the try block after query");
      preparedStatement.setInt(1, employee.getEMPLOYEE_ID());
      preparedStatement.setString(2, employee.getFIRST_NAME());
      preparedStatement.setDouble(3, employee.getSALARY());
     /* preparedStatement.setInt(4, employee.getDEPARTMENT_ID());*/
      
      int rowsUpdate = preparedStatement.executeUpdate();
      return rowsUpdate > 0 ? true : false;
    } catch (SQLException e) {
      logger.error("ERROR WHILE ESTABLISHING THE CONNECTION", e);
      e.printStackTrace();
    }
    //response.sendRedirect("insert.jsp");
    return false;

  }


  public boolean delete(int empId) throws SQLException {
    connection = DBConnectionUtil.getConnection();
    try (PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM empsiva WHERE EMPLOYEE_ID =? ");) {
      System.out.println("inside the try block after query");
      preparedStatement.setInt(1, empId);
      System.out.println(empId);
      int rowsUpdate = preparedStatement.executeUpdate();
      return rowsUpdate > 0 ? true : false;
    
  }catch (Exception e) {
    logger.error("ERROR WHILE ESTABLISHING THE CONNECTION", e);
    e.printStackTrace();
  }

    return false;
  
}
}

  
