package in.vamsoft.training.collection.main;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionMap {

  public static void main(String[] args) {
    Map<Integer, String> map = new HashMap<>();
    if (!map.containsKey(1))
      map.put(1, "siva");
    map.put(2, "bala");
    System.out.println(map);
    Set<Integer> keys=map.keySet();
    System.out.println(keys);
    
    Collection<String> values=map.values();
    System.out.println(values);
    
    Set<Entry<Integer, String>> enteries =map.entrySet();
    for(Entry<Integer, String> e:enteries) {
      System.out.println(e.getKey()+""+e.getValue());
    }
  }

}
