package in.vamsoft.training.collection.main;

public class ThreadExten extends Thread {

  @Override
  public void run() {

    int i, fact = 1;
    int number = 5;// It is the number to calculate factorial
    for (i = 1; i <= number; i++) {
      fact = fact * i;
    }
    System.out.println("Factorial of " + number + " is: " + fact);

  }

}
