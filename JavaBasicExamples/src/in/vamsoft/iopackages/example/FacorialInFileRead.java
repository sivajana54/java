package in.vamsoft.iopackages.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FacorialInFileRead {

  /** The facorialProgram.
   * @param args,
   */
  public static void main(String[] args) {
    Scanner sc;
    try {
      sc = new Scanner(new File("input.txt"));

      int i;
      int fact = 1;
      int input = 0;
      while (sc.hasNextInt()) {

        input = sc.nextInt();

       
        for (i = 1; i <= input; i++) {
          fact = fact * i;
        }
        System.out.println("Factorial of " + input + " is: " + fact);

      }

    } catch (FileNotFoundException e) {
      System.out.println("file not found exception");
      e.printStackTrace();
    }
  }

}
