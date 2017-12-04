package in.vamsoft.thread.excerice.thread;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

class FirstFile extends Thread {

  SecondFile ss;
  String name;
  private static int val;

  public void setSs(SecondFile ss) {
    this.ss = ss;
  }

  public FirstFile(String string) {
    super();
    this.name = string;
  }

  @SuppressWarnings("static-access")
  @Override
  public void run() {
    try {
      Scanner sc = new Scanner(new File("inputvalue.txt"));
      while (sc.hasNextLine()) {
        System.out.println("FirstFile.run()");
        this.val = sc.nextInt();
        synchronized (ss) {
          ss.notify();

        }
        synchronized (this) {
          wait();

        }

      }
      sc.close();
    }

    catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }

  public static int getVal() {
    return val;
  }

}

class SecondFile extends Thread {
  FirstFile ff;

  public void setFf(FirstFile ff) {
    this.ff = ff;
  }

  public SecondFile(String name) {
    super(name);

  }

  public void run() {
    System.out.println("secound run");
    for (int i = 0; i < 5; i++) {
      try {
        synchronized (this) {
          wait();
        }
        
      } catch (InterruptedException e) {
        System.out.println(e);
      }
      int fact = factorial(ff.getVal());
      System.out.println("output previous");
      System.out.println("Factorial calculated for" + ff.getVal() + ":" + fact);
      synchronized (ff) {
        ff.notify();
     
      }
    }
  }

  public int factorial(int val) {
    int f = 1;
    while (val > 0) {
      f = f * val;
      val--;
    }
    return f;
  }
}

public class FileReadFactorial {
  public static void main(String[] args) {
    FirstFile ffile = new FirstFile("firstFile");
    SecondFile sfile = new SecondFile("secound");
    ffile.setSs(sfile);
    sfile.setFf(ffile);
    ffile.start();
    sfile.start();
    try {
      ffile.sleep(1000);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    try {
      sfile.sleep(2000);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}

