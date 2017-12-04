package in.vamsoft.training.general;

import java.util.Scanner;


public class ExceptionEx {

  /**
   * @param args.
   * @exception Arithmatic
   *              exception can be handle.
   */
  public static void main(String[] args) {
    try {
      Scanner scanner = new Scanner(System.in);
      System.out.println("pls enter the value");
      int numerator = scanner.nextInt();
      System.out.println("pls enter the value");
      int denominator = scanner.nextInt();
      int result = numerator / denominator;
      System.out.println(result);
      scanner.close();

    } catch (ArithmeticException e) {
      System.out.println("the error is" + e.getMessage());
    }
    System.out.println("After the catch block executed");

  }
}
