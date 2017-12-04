package in.vamsoft.util.example;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEnum {

  /**vecorenum interface.
   * @param args.
   */
  public static void main(String[] args) {

    Vector<String> vector = new Vector<String>();

    vector.add("siva");
    vector.add("jana");
    vector.add("bala");
    vector.add("jk");
    vector.add("demo");

    Enumeration en = vector.elements();

    System.out.println("Vector elements are: ");
    while (en.hasMoreElements()) {
      {
        System.out.println(en.nextElement());
      }
    }
  }

}
