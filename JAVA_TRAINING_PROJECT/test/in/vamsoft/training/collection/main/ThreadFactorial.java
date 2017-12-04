package in.vamsoft.training.collection.main;

import java.util.Scanner;

class Producer extends Thread {
  Consumer c;
  private int num;

  public void setConsumer(Consumer con) {
    this.c = con;
  }

  public int getNum() {
    return num;
  }

  public void setNum(int num) {
    this.num = num;
  }

  public Producer(String name) {
    super(name);
  }

  public void run() {
    try {
      Scanner s = new Scanner(System.in);
      int nu;
      System.out.println("please enter a number");
      nu = s.nextInt();
      while (nu > 0) {
        System.out.println("number read by producer:" + nu);
        this.num = nu;
        synchronized (c) {
          c.notify();
        }
        synchronized (this) {

          wait();
        }
      }
    } catch (InterruptedException e) {

      System.out.println("e");
    }

  }
}

class Consumer extends Thread {
  Producer prod;

  public Consumer(String name) {
    super(name);

  }

  public void setProd(Producer prod) {
    this.prod = prod;
  }

  public void run() {
    for (int i = 0; i <= 5; i++) {
      try {
        synchronized (this) {
          wait();
        }

      } catch (InterruptedException e) {
        System.out.println(e);
      }
      int fact = factorial(prod.getNum());
      System.out.println("Factorial calculated for" + prod.getNum() + ":" + fact);
      synchronized (prod) {
        prod.notify();

      }
    }
  }

  private int factorial(int num) {
    int f = 1;
    while (num > 0) {
      f = f * num;
      num--;
    }
    return f;
  }

}

public class ThreadFactorial {
  public static void main(String[] args) {

    Producer prod = new Producer("Producer");
    Consumer con = new Consumer("Consumer");
    prod.setConsumer(con);
    con.setProd(prod);
    con.start();
    prod.start();
  }

}
