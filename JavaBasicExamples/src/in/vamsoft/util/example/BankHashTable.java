package in.vamsoft.util.example;

import java.util.Hashtable;
import java.util.Map;

public class BankHashTable {

  public static void main(String[] args) {
    Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
    ht.put("siva", 15000);
    ht.put("bala", 2000);
    ht.put("jk", 3000);
    ht.put("jana", 35000);
    System.out.println("Hash table");
    for (Map.Entry m : ht.entrySet()) {
      System.out.println(m.getKey() + " " + m.getValue());
    }
  }

}
