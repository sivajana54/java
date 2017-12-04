package in.vamsoft.training.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccess {
  public static void main(String[] args) {
    try {
      RandomAccessFile ra = new RandomAccessFile("newfile.txt", "rw");
      ra.write("HAI HELLO WELCOME".getBytes());
      ra.seek(4);
      int c;
      while ((c = ra.read()) != -1) {
        System.out.println((char) c);
      }
      ra.seek(ra.length());
      ra.write("appanding to file".getBytes());
      System.out.println();
      ra.seek(0);
      while ((c = ra.read()) != -1) {
        System.out.println((char) c);

      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}