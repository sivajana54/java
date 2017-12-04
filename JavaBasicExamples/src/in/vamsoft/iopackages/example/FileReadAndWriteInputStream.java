package in.vamsoft.iopackages.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileReadAndWriteInputStream {

  /** FileInputStream,FileOutPutStream.
   * @param args.
   */
  public static void main(String[] args) {

    InputStream is;
    OutputStream os;
    int c;
    try {
      is = new FileInputStream("input.txt");
      os = new FileOutputStream("output.txt");

      while ((c = is.read()) != -1) {
        System.out.print((char) c);
        os.write(c);
        
      }
      is.close();
      os.close();
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();

    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }
}
