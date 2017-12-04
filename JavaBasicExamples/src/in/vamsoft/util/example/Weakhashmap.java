package in.vamsoft.util.example;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class Weakhashmap {

  public static void main(String[] args) {
    Map hashMap = new HashMap();
    String HashMap = new String("HashMap");
    hashMap.put(HashMap, "hello welcome");

    Map weakHashMap = new WeakHashMap();
    String WeakHashMap = new String("WeakHashMap");
    weakHashMap.put(WeakHashMap, "hello welcome to java");

    System.out.println("Before: hash map value:" + hashMap.get("HashMap") 
                                               + " and weak hash map value:"
                                         + weakHashMap.get("WeakHashMap"));

    HashMap = null;
    WeakHashMap = null;

    System.gc();

    System.out.println("After: hash map value:" + hashMap.get("HashMap") 
                                  + " and weak hash map value:"
                                      + weakHashMap.get("WeakHashMap"));
  }

}
