package in.vamsoft.thread.example;

public class SecondThread implements Runnable {

  @Override
  public void run() {
    for (int i = 0; i <= 20; i++) {
      System.out.println("Second thread" + i);
    }

  }

}
