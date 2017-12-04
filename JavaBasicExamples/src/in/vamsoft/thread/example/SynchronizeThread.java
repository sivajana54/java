package in.vamsoft.thread.example;

public class SynchronizeThread  extends Thread{
  Simplethread thread = new Simplethread();

  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println(i);
      Simplethread.display();
      synchronized (thread) {
        try {
          wait();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }
  }
}
