package in.vamsoft.training.collection.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {
public static void main(String[] args) {
  Map<String, String> dis = new HashMap<>();
   dis.put("ball","Cricket Ball");
   dis .put("bat", "Cricket Bat");
   System.out.println(dis);
   
   Scanner sc = new Scanner(System.in);
   System.out.println("pls enter the word");
    String mean =sc.nextLine();
    if(dis.containsKey(mean)) {
      System.out.println(dis.get(mean));
    }else {
      System.out.println("Not my Dictionary");
    }
    sc.close();
}
}
