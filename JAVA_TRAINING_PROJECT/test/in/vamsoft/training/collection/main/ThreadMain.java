package in.vamsoft.training.collection.main;

public class ThreadMain {
  public static void main(String[] args) throws InterruptedException {
    ThreadExten f1 = new ThreadExten();
    f1.setName("fact");
    f1.start();
    try {
      f1.sleep(2000);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    Runnablrthread rt = new Runnablrthread();
    Thread tr = new Thread(rt);
    tr.setName("fabinocis");
    tr.start();
    try {
      tr.sleep(1000);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    f1.join();
    tr.join(2000);
    tr.setPriority(10);
    System.out.println(tr
        ); 
    System.out.println("main finish");
    
  }
}
