package in.vamsoft.training.databaseutil;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.log4j.Logger;

public class DataBaseConnectionUtil {
  public static Logger logger = Logger.getLogger(DataBaseConnectionUtil.class);

  /** get database connection.
   * @return connection.
   */
  public static Connection getConnection() {
    String driver = null;
    String url = null;
    String username = null;
    String password = null;
    Connection connection = null;
    try {
      InputStream read = DataBaseConnectionUtil.class.getClassLoader()
                                  .getResourceAsStream("database.properties");
      Properties properties = new Properties();
      properties.load(read);
      logger.info("database conncetion done");
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

  /**Connection close  method.
   * @param connection.
   */
  public static void closeconnection(Connection connection) {
    try {
      connection.close();
      logger.info("connection close");
    } catch (Exception e) {
      logger.info("error in close", e);
    }

  }
}
