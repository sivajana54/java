package in.vamsoft.training.servlet;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.log4j.Logger;

public class DBConnectionUtil {
  public static Logger logger = Logger.getLogger(DBConnectionUtil.class);

  public static Connection getConnection() {
    String driver = null;
    String url = null;
    String username = null;
    String password = null;
    Connection connection = null;
    try {
      FileReader read = new FileReader("src/database.properties");
      Properties properties = new Properties();
      properties.load(read);
      driver = properties.getProperty("driver");
      url = properties.getProperty("url");
      username = properties.getProperty("username");
      password = properties.getProperty("password");
      Class.forName(driver);
      connection = DriverManager.getConnection(url, username, password);
      logger.info("connection done");

    } catch (FileNotFoundException e) {
      logger.error("DB properties file not found", e);

    } catch (IOException e) {
      logger.error("DB properties file not found", e);
    } catch (ClassNotFoundException e) {
      logger.error("Class not found", e);
    } catch (SQLException e) {
      logger.error("SQLException found", e);

    }
    return connection;
  }

  public  static void closeconnection(Connection connection) {
    try {
      connection.close();
      logger.info("connection close");
    } catch (Exception e) {
      logger.info("error in close", e);
    }

  }
}
