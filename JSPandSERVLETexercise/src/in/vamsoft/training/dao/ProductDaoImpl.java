package in.vamsoft.training.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import in.vamsoft.training.databaseutil.DataBaseConnectionUtil;
import in.vamsoft.training.model.Product;

public class ProductDaoImpl implements ProductDao {
  Connection con = null;
  Statement statement = null;
  ResultSet resultSet = null;
  public List<Product> getProductInformation() {
    List<Product> list = new ArrayList<>();
    try {
        con = DataBaseConnectionUtil.getConnection();
        statement = con.createStatement();
        resultSet = statement.executeQuery("select productName from ProductInformation");
      Product details = null;
      while (resultSet.next()) {
        details = new Product();
        details.setProductName(resultSet.getString(1));
        System.out.println(resultSet.getString(1));
       
        list.add(details);
      }
      return list;

    } catch (SQLException e) {
      e.printStackTrace();
    }
    return null;
  }
}
