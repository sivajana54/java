package in.vamsoft.thread.excerice.thread;

public class SecoundThread extends Thread {

  @Override
  public void run() {
    for (int i = 1; i <= 1000; i += 10) {
      System.out.println("THE SECOUND THREAD" + i);
    }

  }
}
