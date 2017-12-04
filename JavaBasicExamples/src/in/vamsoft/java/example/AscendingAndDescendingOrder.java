package in.vamsoft.java.example;

import java.util.Scanner;

public class AscendingAndDescendingOrder {

  /**
   * The Given Program For Ascending And DescendingOrder.
   * 
   * @param args.
   */
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.print("Enter the  number of elements in array:");
    int n = s.nextInt();
    int[] a = new int[n];
    System.out.println("Enter all the elements:");
    for (int i = 0; i < n; i++) {
      a[i] = s.nextInt();
    }
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (a[i] > a[j]) {
          int temp = a[i];
          a[i] = a[j];
          a[j] = temp;
        }
      }
      s.close();
    }
    System.out.println("Ascending Order:");
    for (int i = 0; i < n; i++) {
      System.out.print(a[i] + "");
    }
    System.out.println("Descending Order:");
    for (int i = n - 1; i >= 0; i--) {
      System.out.println(a[i] + "");
    }

  }

}
