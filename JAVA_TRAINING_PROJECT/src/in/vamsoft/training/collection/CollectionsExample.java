package in.vamsoft.training.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {

  public static void main(String[] args) {
    List<Integer> list =new ArrayList<>();
        list.add(400);
    list.add(200);
    list.add(300);
    list.add(100);
    list.add(700);
    Collections.sort(list);
    System.out.println(list);
    
    Collections.reverse(list);
    System.out.println(list);
    
   
    

  }

}
