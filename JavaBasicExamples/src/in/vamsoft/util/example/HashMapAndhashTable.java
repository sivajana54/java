package in.vamsoft.util.example;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashMapAndhashTable {

  public static void main(String[] args) {
   
 

    Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
    ht.put(101," demo");
    ht.put(101,"siva");
    ht.put(102,"kjk");
    ht.put(103,"jana");
    System.out.println("Hash table");
    for (Map.Entry m:ht.entrySet()) {
        System.out.println(m.getKey()+" "+m.getValue());
    }

   
    HashMap<Integer,String> hm=new HashMap<Integer,String>();
    hm.put(100,"Amit");
    hm.put(101,"Amit");  
    hm.put(null,null);
    hm.put(12,"Rahul");
    System.out.println("Hash map");
    for (Map.Entry m:hm.entrySet()) {
        System.out.println(m.getKey()+" "+m.getValue());

  }

}
}
