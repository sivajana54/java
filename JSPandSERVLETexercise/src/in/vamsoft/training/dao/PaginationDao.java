package in.vamsoft.training.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import in.vamsoft.training.databaseutil.DataBaseConnectionUtil;
import in.vamsoft.training.model.PaginationEmployee;
import in.vamsoft.training.model.Product;

public class PaginationDao {
  Connection connection;
  Statement statement;
   ResultSet resultSet;

  public PaginationDao() {

    connection = DataBaseConnectionUtil.getConnection();
  }

  public List<PaginationEmployee> getPageForPagination() {
    List<PaginationEmployee> list = new ArrayList<>();
    try {
      connection = DataBaseConnectionUtil.getConnection();
        statement = connection.createStatement();
        resultSet = statement.executeQuery("select * from employees");
      PaginationEmployee details = null;
      while (resultSet.next()) {
        details = new PaginationEmployee();
        details.setEmployeeId(resultSet.getInt(1));
        System.out.println(resultSet.getString(1));
        details.setFirstName(resultSet.getString(2));
        details.setLastName(resultSet.getString(3));
        details.setEmail(resultSet.getString(4));
        details.setPhoneNumber(resultSet.getString(5));
        details.setHireDate(resultSet.getDate(6));
        details.setJobId(resultSet.getString(7));
        details.setSalary(resultSet.getInt(8));
        details.setCommisionPct(resultSet.getInt(9));
        details.setManagerId(resultSet.getInt(10));
        details.setDepartmentId(resultSet.getInt(11));
       
        list.add(details);
      }
      return list;
    

    } catch (SQLException e) {
      e.printStackTrace();
    }
    return null;
  }
  
}
