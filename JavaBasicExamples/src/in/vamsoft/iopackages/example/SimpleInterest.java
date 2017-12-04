package in.vamsoft.iopackages.example;

import java.util.Scanner;

public class SimpleInterest {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    String userResponse = null;
    double startingBalance = -1, interestRate = -1;

    do {
      System.out.println("Enter the starting balance : ");
      userResponse = input.next();
      try {
        startingBalance = Double.parseDouble(userResponse);
      } catch (NumberFormatException e) {
        System.out.println("Number is not valid");
      }
      if (startingBalance <= 0) {
        System.out.println("Sorry, that value is not valid.");
      } else {
        break;
      }
    } while (true);

    do {
      System.out.println("Enter the interest rate : ");
      userResponse = input.next();
      try {
        interestRate = Double.parseDouble(userResponse);
      } catch (NumberFormatException e) {
        System.out.println("Numer no valid");

      }

      if (interestRate <= 0 || interestRate > 20) {
        System.out.println("Sorry, that value is not valid.");
      } else {
        break;
      }
    } while (true);

    System.out.println("The starting balance of: " + startingBalance);
    System.out.println("The interest rate: " + interestRate);

    double balance = startingBalance + (startingBalance * interestRate / 100 * .25);
    System.out.println("Your  balance  is " + balance);

  }

}
