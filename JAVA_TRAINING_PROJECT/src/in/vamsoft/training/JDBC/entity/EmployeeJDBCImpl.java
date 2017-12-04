package in.vamsoft.training.JDBC.entity;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import in.vamsoft.training.JDBC.FirstJDBCDemo;

public class EmployeeJDBCImpl implements AutoCloseable, EmployeeDAO {
  public static Logger logger = Logger.getLogger(EmployeeJDBCImpl.class);
  Connection connection =null;
  ResultSet resultset =null;

  public EmployeeJDBCImpl() {
    connection = DBConnectionUtil.getConnection();
  }

  public boolean add(Employee employee) {
    try (PreparedStatement preparedStatement = connection.prepareStatement("insert into empcopy values(?,?,?,?,?)");) {
      preparedStatement.setInt(1, employee.getEmployee_id());
      preparedStatement.setString(2, employee.getFname());
      preparedStatement.setDouble(3, employee.getSalary());
      preparedStatement.setDate(4, Date.valueOf(employee.getDoj()));
      preparedStatement.setInt(5, employee.getDeptid());

      int rowsUpdate = preparedStatement.executeUpdate();
      return rowsUpdate > 0 ? true : false;
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      logger.error("ERROR WHILE ESTABLISHING THE CONNECTION", e);
      e.printStackTrace();
    }

    return false;

  }

  public boolean delete(int employee_id) {
    try (
        PreparedStatement preparedStatement = connection.prepareStatement("delete from empcopy where employee_id=?");) {
      preparedStatement.setInt(1, employee_id);
      int rowsUpdate = preparedStatement.executeUpdate();
      return rowsUpdate > 0 ? true : false;
    } catch (SQLException e) {
      logger.error("ERROR WHILE ESTABLISHING THE CONNECTION", e);
      e.printStackTrace();
    }
    return false;
  }

  
    
  
  public Employee findEmployee(int employee_id) {
    try (PreparedStatement preparedStatement = connection
        .prepareStatement("select * from empcopy where employee_id=?");) {
      preparedStatement.setInt(1, employee_id);
      resultset = preparedStatement.executeQuery();
      Employee employee = null;
      if (resultset.next()) {
        employee = new Employee();
        employee.setEmployee_id(resultset.getInt(1));
        employee.setFname(resultset.getString(2));
        employee.setSalary(resultset.getDouble(3));
        employee.setDoj((resultset.getDate(4)).toLocalDate());
        employee.setDeptid(resultset.getInt(5));
      }

    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return null;
  }

  @Override
  public void close() throws Exception {
    // TODO Auto-generated method stub
    connection.close();

  }

}
