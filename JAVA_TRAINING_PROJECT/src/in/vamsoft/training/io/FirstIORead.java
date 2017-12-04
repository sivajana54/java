package in.vamsoft.training.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstIORead {
  public static void main(String[] args) {
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter the name");

    String name="";
    do {
      try {
         name = read.readLine();
        System.out.println(name);
        read.close();
      } catch (IOException e) {
        e.printStackTrace();

      }

    } while (!(name.equals("quit")));
    System.out.println("enter the name");

  }

}
