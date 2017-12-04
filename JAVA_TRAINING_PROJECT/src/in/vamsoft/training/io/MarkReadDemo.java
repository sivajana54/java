package in.vamsoft.training.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class MarkReadDemo {
  public static void main(String[] args) {
    try (InputStream is = new BufferedInputStream(new FileInputStream("src/newfile.txt"), 1);) {
      System.out.println("the char is print");

      System.out.println((char) is.read());
      System.out.println((char) is.read());
      System.out.println((char) is.read());
      is.mark(4);
      System.out.println("mark ()invoke");
      System.out.println((char) is.read());
      System.out.println((char) is.read());
      System.out.println((char) is.read());
      System.out.println((char) is.read());
      is.mark(28);
      System.out.println((char) is.read());
      System.out.println((char) is.read());
      System.out.println((char) is.read());
      System.out.println((char) is.read());
      
      if (is.markSupported()) {
        is.reset();
        System.out.println("reset() is invoke");
        System.out.println((char) is.read());
        System.out.println((char) is.read());
        System.out.println((char) is.read());
        System.out.println((char) is.read());
        System.out.println((char) is.read());
        System.out.println((char) is.read());
        is.reset();
        System.out.println((char) is.read());
        System.out.println((char) is.read());
        System.out.println((char) is.read());
        System.out.println((char) is.read());
        System.out.println((char) is.read());
        System.out.println((char) is.read());
        System.out.println((char) is.read());
        
      }else
      {
        System.out.println((char) is.read()+"+"+"invalid");
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
