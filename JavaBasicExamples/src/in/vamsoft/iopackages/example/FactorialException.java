package in.vamsoft.iopackages.example;

import java.util.Scanner;

public class FactorialException {

  /**
   * The negative value catch in catch block.
   * 
   * @param args.
   */
  public static void main(String[] args) {

    try {
      int number;
      System.out.println("Enter an integer to Finds it's factorial");
      Scanner scan = new Scanner(System.in);
      number = scan.nextInt();
      scan.close();
      if (number < 0) {
        throw new NumberFormatException();
      } else {
        int fact = number;
        for (int i = (number - 1); i > 1; i--) {
          fact = fact * i;
        }
        System.out.println("Factorial of a number is " + fact);
      }
    } catch (NumberFormatException e) {
      System.out.println("The Negative value is not allowed for this factorial calculation");

    }
  }

}
