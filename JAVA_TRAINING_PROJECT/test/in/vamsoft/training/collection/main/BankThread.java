package in.vamsoft.training.collection.main;

public class BankThread implements Runnable {
  Accounts a;
  double withdraw;

  @Override
  public void run() {
    System.out.println("Balance for :" + Thread.currentThread().getName() + ":" + a.getBalance());
    synchronized (a) {
      a.withdraw(withdraw);

    }
  }

  public BankThread(Accounts a, double withdraw) {
    super();
    this.a = a;
    this.withdraw = withdraw;
  }

  public static void main(String[] args) {
    Accounts account = new Accounts(1000);
    BankThread b1 = new BankThread(account, 500);
    BankThread b2 = new BankThread(account, 750);
    Thread t1 = new Thread(b1, "Thread 1");
    Thread t2 = new Thread(b2, "thread 2");
    t1.start();
    t2.start();

  }
}
