package in.vamsoft.thread.example;

public class Simplethread extends Thread {
  @Override
  public void run() {
    System.out.println("Thread2.run()" + currentThread().getPriority());
    Simplethread.display();
  }

  public static void display() {
    System.out.println("Simplethread.display() method");
    
  }
}
