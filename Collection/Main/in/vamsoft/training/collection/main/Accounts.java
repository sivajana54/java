package in.vamsoft.training.collection.main;

public class Accounts {
  double balance;

  public Accounts(double balance) {
    super();
    this.balance = balance;
  }

  public double getBalance() {
    return balance;
  }

  public void withdraw(double amount) {
    if (balance - amount >= 0) {
      try {
        Thread.sleep(5000);

      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      balance -= amount;
      System.out.println("withdraw succesful" +":"+ Thread.currentThread().getName()+":"+  "the balance is:"
          + getBalance());
    } else {
      System.out.println("the amount was insufficent" +":"+ Thread.currentThread().getName()+":"
          + "the balce is:" + getBalance());
    }
  }
}
