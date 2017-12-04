package in.vamsoft.thread.excerice.thread;

public class ThirdThread extends Thread{
  public void run() {
    for(int i=1;i<=1000;i+=100) {
      System.out.println("THE THIRD THREAD" + i);
    }
  }
}
