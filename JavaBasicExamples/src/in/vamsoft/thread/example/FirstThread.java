package in.vamsoft.thread.example;

public class FirstThread extends Thread {
  @Override
  public void run() {

    for (int i = 0; i <= 10; i++) {
      System.out.println("The first Thread" + i);
    }

  }

}
