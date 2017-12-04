package in.vamsoft.exceries.main.thread;

import in.vamsoft.thread.excerice.thread.FirstThread;
import in.vamsoft.thread.excerice.thread.SecoundThread;
import in.vamsoft.thread.excerice.thread.ThirdThread;

public class MainThread {
  public static void main(String[] args) {
    FirstThread ft1 = new FirstThread();
    SecoundThread sc2 = new SecoundThread();
    ThirdThread th3 = new ThirdThread();
    ft1.start();
    sc2.start();
    th3.start();
    
  }

}
