package in.vamsoft.java.example;

import java.util.Scanner;

public class MaximumNumberInArray {

  /**The given program for find the  max number in array.
   * @param args.
   */
  public static void main(String[] args) {
    {

      Scanner s = new Scanner(System.in);
      System.out.print("Enter number of elements in the array:");
     
      int n = s.nextInt();
      int[] a = new int[n];
      System.out.println("Enter elements of array:");
    
      for (int i = 0; i < n; i++) {
        a[i] = s.nextInt();
      }
      int max = a[0];
      for (int i = 0; i < n; i++) {
        if (max < a[i]) {
          max = a[i];
        }
      }
      System.out.println("Maximum value:" + max);
      s.close();
    }
 
  }

}
