package in.vamsoft.training.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FileReadWriteProgram {
  public static void main(String[] args) {
    /*Scanner i = new Scanner(System.in);
    System.out.println("eneter input");
    String input = i.nextLine();*/
    try (BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/data.txt"));
        BufferedReader bw1 = new BufferedReader(new FileReader("src/data.txt"));) {
      System.out.println("name");
      String name = br1.readLine();
      bw.write("Name:" + name);
      bw.newLine();
      System.out.println("age");
      String age = br1.readLine();
      bw.write("Age:" + age);
      bw.newLine();
      br1.close();
      bw.close();

      System.out.println("the entery is");
      String data = "";

      while ((data = bw1.readLine()) != null) {
        System.out.println(data);
      }

    }

    catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
