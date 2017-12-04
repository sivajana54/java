package in.vamsoft.java.main;

import in.vamsoft.thread.example.FirstThread;
import in.vamsoft.thread.example.SecondThread;

public class MainThread {

  /**The simple thread control program main method used first thread and second thread.
   * @param args.
   */
  @SuppressWarnings({ "static-access" })
  public static void main(String[] args) {
    try {
      FirstThread ft = new FirstThread();
      SecondThread st = new SecondThread();
      ft.start();
      ft.sleep(2000);

      Thread th = new Thread(st);
      th.start();
      th.sleep(3000);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

}
