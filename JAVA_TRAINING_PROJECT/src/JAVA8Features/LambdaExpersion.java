package JAVA8Features;

public  class LambdaExpersion extends Thread {
  public static void main(String[] args) {

    Runnable r1 = new Runnable() {

      @Override
      public void run() {
        for (int i = 0; i <= 10; i++) {
          System.out.println(i);
        }

      }
    };

    Runnable r2 = new Runnable() {

      @Override
      public void run() {
        for (int i = 0; i > 10; i--) {
          System.out.println(i);
        }
      }
    };
    Thread t1= new Thread(r1);
    Thread t2 = new Thread(r2);
    Runnable run =()-> {
      System.out.println("hello");
 
    };
    System.out.println(t1
        );
    
  }
}
