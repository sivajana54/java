package in.vamsoft.java.example;

/**
 * The Program for the Multiplication Program.
 * 
 * @author vamsoft.
 */
public class MultiplicationTable {
  /**
   * @param args
   *          The Value are enter by the arg.
   */
  public static void main(String[] args) {
    try {
      System.out.println("The print their multiplication table is" + args[0]);

      int a = Integer.parseInt(args[0]);

      for (int c = 1; c <= 20; c++) {
        System.out.println("Multiplication table of " + c + "*" + a + " = " + c * a);
      }
    } catch (NumberFormatException e) {
      System.out.println(e.getMessage());
      System.out.println("please enter the Integer Format");
    }
  }
}
