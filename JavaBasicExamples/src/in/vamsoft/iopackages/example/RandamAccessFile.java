package in.vamsoft.iopackages.example;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandamAccessFile {

  /**Randam AccessFile for read and write.
   * @param args.
   */
  public static void main(String[] args) {
    try {

      RandomAccessFile randamfile = new RandomAccessFile("randamfile.txt", "rw");

      randamfile.writeUTF("We are the software engineers");

      randamfile.seek(0);

      System.out.println("" + randamfile.readUTF());

      System.out.println("" + randamfile.getFilePointer());

      randamfile.seek(8);

      System.out.println("" + randamfile.getFilePointer());

      randamfile.close();

    } catch (IOException ex) {
      ex.printStackTrace();
    }

  }

}
