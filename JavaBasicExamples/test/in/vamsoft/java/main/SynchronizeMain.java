package in.vamsoft.java.main;

import in.vamsoft.thread.example.Simplethread;
import in.vamsoft.thread.example.SynchronizeThread;

public class SynchronizeMain {

  /** synchronize thread.
   * @param args
   */
  public static void main(String[] args) {
    Simplethread t1 = new Simplethread();
    SynchronizeThread t2 = new SynchronizeThread();
    t1.start();
    t2.start();
  }

}


