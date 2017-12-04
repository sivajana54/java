package in.vamsoft.training.general;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionExampleArrayList {
  /**
   * @param args.
   */
  public static void main(String[] args) {
    List<String> test = new ArrayList<String>();
    String s = "hi";
    test.add("string");
    test.add(s);
    test.add(s + s);
    System.out.println(test.size());
    System.out.println(test.contains(42));
    System.out.println(test.contains("string"));
    System.out.println(test.contains("hi"));
    System.out.println(test.contains("hihi"));
    test.remove("hi");
    System.out.println(test.size());
    System.out.println(test.contains("hi"));
    System.out.println("unsorted form" + test);
    Collections.sort(test);
    Collections.reverse(test);
    System.out.println("sorted form" + test);
    
  }

}
