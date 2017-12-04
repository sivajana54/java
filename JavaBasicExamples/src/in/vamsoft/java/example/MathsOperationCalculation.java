package in.vamsoft.java.example;

import java.util.Scanner;

class Calculation {
  public double simpleInterestcalculation(double r, double t, double p) {

    return (r * t * p) / 100;

  }

  public double componentInterest(double r, double t, double p) {
    return p * Math.pow(1.0 + r / 100.0, t) - p;

  }

  public double squareRoot(double value) {
    return Math.sqrt(value);

  }

  public double square(double value) {
    return Math.pow(value, 2);

  }

  double factorial(double value) {
    double fact = 1;

    for (double b = value; b > 1; b--) {
      fact = fact * b;
    }
    return fact;
  }

}

public class MathsOperationCalculation {

  /**
   * Calculation of SimpleInterest.
   * 
   * @param args.
   */
  public static void main(String[] args) {
    Calculation cal = new Calculation();

    Scanner scanner = new Scanner(System.in);
    System.out.println("please enter the amount");
    double p = scanner.nextDouble();

    System.out.println("please enter the interest");
    double r = scanner.nextDouble();

    System.out.println("please enter the time period");
    double t = scanner.nextDouble();

    System.out.println("The Simple Interest is:" + cal.simpleInterestcalculation(r, t, p));
    System.out.println("The ComponentInterest is:" + cal.componentInterest(r, t, p));

    Scanner scanner1 = new Scanner(System.in);
    System.out.println("please enter the Square Root Value");
    double value = scanner1.nextDouble();
    System.out.println("The SquareRoot is:" + cal.squareRoot(value));
    System.out.println("The Square Is" + cal.square(value));
    System.out.println("The Factorial value Is:" + cal.factorial(value));
    scanner.close();
    scanner1.close();
  }

}
