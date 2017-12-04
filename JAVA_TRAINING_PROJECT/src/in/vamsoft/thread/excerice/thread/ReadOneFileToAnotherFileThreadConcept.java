package in.vamsoft.thread.excerice.thread;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

class File1thread extends Thread {
  File2Thread f1;
  String st;
  String str;

  public File1thread(String name, String str) {
    super(name);
    this.str = str;
  }

  public void run() {

    try {

      Scanner scanner = new Scanner(new File(str));

      while (scanner.hasNextLine()) {
        st = scanner.nextLine();

        System.out.println("Filethread1" + ":"+st);

      }
    } catch (FileNotFoundException e) {

      System.out.println("e");
    } catch (IOException e) {

      e.printStackTrace();
    }
  }

}

class File2Thread extends Thread {
  File1thread f2;
  String st;
  String str;

  public File2Thread(String name, String str) {
    super(name);
    this.str = str;
  }

  public void run() {
    try {
      Scanner scanner = new Scanner(new File(str));

      while (scanner.hasNextLine()) {
        st = scanner.nextLine();
        System.out.println("filethread2" +":"+ st);
      }
    } catch (FileNotFoundException e) {
      System.out.println(e);
    }

  }
}

public class ReadOneFileToAnotherFileThreadConcept {
  public static void main(String[] args) {

    File1thread f1 = new File1thread("file1", args[0]);
    File2Thread f2 = new File2Thread("file2", args[1]);
    f1.start();
    f2.start();

  }
}
