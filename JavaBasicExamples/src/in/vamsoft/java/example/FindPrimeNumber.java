package in.vamsoft.java.example;

import java.util.Scanner;

public class FindPrimeNumber {
  /**
   * the given program for check whether check prime or not.
   * 
   * @param args.
   */
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("pls enter the value for check the given number is prime or not");
    int num = sc.nextInt();
    boolean flag = false;
    for (int i = 2; i <= num / 2; ++i) {

      if (num % i == 0) {
        flag = true;
        break;
      }
      sc.close();
    }

    if (!flag) {
      System.out.println(num + " is a prime number.");
    } else {
      System.out.println(num + " is not a prime number.");
    }
  }
}
