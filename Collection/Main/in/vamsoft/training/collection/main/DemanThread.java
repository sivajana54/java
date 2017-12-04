package in.vamsoft.training.collection.main;

class NormalThread extends Thread {

  @Override
  public void run() {

    // It is the number to calculate factorial
    for (int i = 1; i <= 10; i++) {
      System.out.println("print normal" + i);

      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
  }
}

class Demon extends Thread {
  public void run() {

    // It is the number to calculate factorial
    for (int i = 1; i <= 15; i++) {
      System.out.println("print deman" + i);

      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
  }
}

public class DemanThread {
  public static void main(String[] args) throws InterruptedException {

    NormalThread f1 = new NormalThread();
    Demon f2 = new Demon();
    f2.setDaemon(true);
    f1.start();
    f2.start();
  }
}