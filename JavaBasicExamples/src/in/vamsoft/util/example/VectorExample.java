package in.vamsoft.util.example;

import java.util.Collections;
import java.util.Vector;

public class VectorExample {

  /**Simple Vector program.
   * @param args.
   */
  public static void main(String[] args) {
    Vector<String> vector = new Vector<String>();
    vector.add("siva");
    vector.add("jana");
    vector.add("bala");
    vector.add("jk");
    vector.add("demo");
    System.out.println("Vector elements before sorting: ");
    for (int i = 0; i < vector.size(); i++) {

      System.out.println(vector.get(i));
    }
    Collections.sort(vector);
    System.out.println("Vector elements after sorting: :");
    for (int i = 0; i < vector.size(); i++) {
      System.out.println(vector.get(i));
    }
    vector.remove("demo");

    System.out.println("\nVector elements after remove(): ");
    for (int i = 0; i < vector.size(); i++) {
      System.out.println(vector.get(i));
    }

  }
}
