package in.vamsoft.java.example;

import java.util.Scanner;

public class SumOfSeries {

  /**
   * The Given Program For Sum Of Series.
   * 
   * @param args.
   */
  public static void main(String[] args) {
    double sum = 1;
    Scanner sc1 = new Scanner(System.in);
    System.out.println("please enter the value for x");
    int input1 = sc1.nextInt();

    Scanner sc2 = new Scanner(System.in);
    System.out.println("please enter the value for n");
    int input2 = sc2.nextInt();

    for (int i = 1; i <= input2; i++) {

      sum = sum + Math.pow(input1, i) / factorial(i);

    }
    System.out.println("The Sum Of value is :" + sum);
    sc1.close();
    sc2.close();
  }

  private static double factorial(double a) {
    double fact = 1;

    for (double b = a; b > 1; b--) {
      fact = fact * b;
    }
    return fact;
  }

}
