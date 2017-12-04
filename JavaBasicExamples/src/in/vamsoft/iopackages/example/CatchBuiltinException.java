package in.vamsoft.iopackages.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CatchBuiltinException {

  /**
   * The different type of exception.
   * 
   * @param args.
   */
  public static void main(String[] args) {
    try {
      int a = 30;
      int b = 0;
      int c = a / b;
      System.out.println("Result = " + c);
    } catch (ArithmeticException e) {
      System.out.println("Can't divide a number by 0");
    }
    try {
      int[] a = new int[5];
      a[6] = 9;

    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Array Index is Out Of Bounds");
    }

    try {

      File file = new File("E:// file.txt");

      FileReader fr = new FileReader(file);
    } catch (FileNotFoundException e) {
      System.out.println("File does not exist");
    }

    try {
      String a = null;
      System.out.println(a.charAt(0));
    } catch (NullPointerException e) {
      System.out.println("NullPointerException..");
    }

    try {

      int num = Integer.parseInt("siva");

      System.out.println(num);
    } catch (NumberFormatException e) {
      System.out.println("Number format exception");
    }

    try {
      String a = "Hai Hello Welcome to java ";
      char c = a.charAt(27);
      System.out.println(c);
    } catch (StringIndexOutOfBoundsException e) {
      System.out.println("StringIndexOutOfBoundsException");
    }
  }

}
