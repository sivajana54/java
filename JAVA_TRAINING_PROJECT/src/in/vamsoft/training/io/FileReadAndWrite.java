package in.vamsoft.training.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileReadAndWrite {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("source address");
    String userinput = input.nextLine();
    Scanner output = new Scanner(System.in);
    System.out.println("destination Address");
    String useroutput = output.nextLine();
    try (FileInputStream fi = new FileInputStream(userinput); FileOutputStream fo = new FileOutputStream(useroutput);) {
      int count = 0;
      while ((count = fi.read()) != -1) {
        fo.write(count);
      }
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

}
