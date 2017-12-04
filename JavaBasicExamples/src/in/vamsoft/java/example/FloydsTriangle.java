package in.vamsoft.java.example;

import java.util.Scanner;

public class FloydsTriangle {

  /**
   * The Main method for FloydsTriangle.
   * 
   * @param args.
   */
  /**
   * @param args
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of rows you want to display");
    int rows = input.nextInt();
    printFloydTriangle(rows);
    printFloyd(rows);
    printFloyd0and1(rows);
    input.close();
  }

  /**
   * @param rows
   *          The logic are given this printFloydTriangle method.
   */
  public static void printFloydTriangle(int rows) {
    int number = 1;
    System.out.printf("Floyd's triangle of %d rows is : %n", rows);
    for (int i = 1; i <= rows; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(number + " ");
        number++;
      }
      System.out.println();
    }
  }

  /**
   * The logic are given this printFloydTriangle method.
   */
  public static void printFloyd(int samevalue) {
    int number = 0;
    System.out.printf("Floyd's triangle of %d rows is : %n", samevalue);
    for (int i = 1; i <= samevalue; i++) {
      number++;
      for (int j = 1; j <= i; j++) {
        System.out.print(number + " ");

      }
      System.out.println();
    }
  }

  /**
   * The logic are given this printFloydTriangle method.
   */
  public static void printFloyd0and1(int samevalue) {
    int number = 0;
    System.out.printf("Floyd's triangle of %d rows is : %n", samevalue);
    for (int i = 1; i <= samevalue; i++) {

      for (int j = 1; j <= i; j++) {
        System.out.print(number % 2 + " ");
        number++;
      }
      System.out.println();
    }
  }
}
