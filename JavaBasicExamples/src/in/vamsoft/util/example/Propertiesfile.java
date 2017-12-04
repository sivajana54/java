package in.vamsoft.util.example;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Propertiesfile {

  /**
   * The insert of properties file
   * 
   * @param args
   * @throws IOException
   */
  public static void main(String[] args) throws IOException {
    // FileReader reader = new FileReader("EmployeeInformation.txt");
    Properties p = new Properties();
    Set set = p.entrySet();
    p.setProperty("id", "001");
    p.setProperty("name", "siva");
    p.setProperty("id", "002");
    p.setProperty("name", "bala");
    p.setProperty("id", "003");
    p.setProperty("name", "jana");

    p.store(new FileWriter("EmployeeInformation.txt"), "");

    

    Iterator itr = set.iterator();
    while (itr.hasNext()) {
      Map.Entry entry = (Map.Entry) itr.next();
      System.out.println(entry.getKey() + " = " + entry.getValue());
      /*
       * System.out.println(p.getProperty("id"));
       * System.out.println(p.getProperty("name"));
       */
    }

  }
}
