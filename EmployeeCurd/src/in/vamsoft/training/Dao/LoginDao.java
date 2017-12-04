package in.vamsoft.training.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Logger;

import in.vamsoft.training.dbutil.DBConnectionUtil;
import in.vamsoft.training.model.Login;

public class LoginDao {
  public static Logger LOGGER = Logger.getLogger(LoginDao.class.getName());

  public static boolean validate(Login bean) {

    boolean status = false;
    try {

      Connection con = DBConnectionUtil.getConnection();
      LOGGER.info("Connection Done");
      System.out.println("Connection established for DAo");
      PreparedStatement ps = con.prepareStatement("select * from uservalidation where user_name=? and password=?");

      ps.setString(1, bean.getUsername());
      ps.setString(2, bean.getPass());
      ResultSet rs = ps.executeQuery();
      status = rs.next();
      System.out.println(bean.getUsername());
      System.out.println(bean.getPass());
 

    } catch (Exception e) {
      System.out.println("not login");
    }

    return status;

  }
}
