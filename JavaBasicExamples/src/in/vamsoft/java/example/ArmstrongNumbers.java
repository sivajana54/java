package in.vamsoft.java.example;

import java.util.Scanner;

public class ArmstrongNumbers {

  /**
   * The Program for check the ArmstrongNumbers of given number.
   * 
   * @param args.
   */
  public static void main(String[] args) {
    int value = 0;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter  num :");
    int num = s.nextInt();
    s.close();

    int d = num;
    while (num > 0) {
      int a = num % 10;
      num = num / 10;
      value = value + a * a * a ;
    }
    if (value == d) {
      System.out.println("Armstrong :" + value);
    } else {
      System.out.println("not Armstrong" + value);
    }

  }

}
