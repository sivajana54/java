package in.vamsoft.java.example;

import java.util.Scanner;

public class FibonacciSeries {

  /** The Program for calculate the FibonacciSeries of given number.
   * @param args.
   */
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    System.out.println("How many elements you want to print in a Fibonacci series");

    in.close();
    System.out.println("Fibonacci series");
    int a = 0;
    int b = 1;
    System.out.print(a + " " + b + " ");

    int next;

    int i = 2;

    int n = in.nextInt();
    while (i < n) {

      next = a + b;

      System.out.print(next + " ");

      a = b;
      b = next;

      i++;
    }
  }

}
