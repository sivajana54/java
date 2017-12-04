package in.vamsoft.java.example;

public class SumOfNumber {

  /**
   * The SumOfNumber Program.
   * 
   * @param args
   *          The Value are enter by the arg.
   */
  public static void main(String[] args) {
    try {
      int sum = 0;
      int n = Integer.parseInt(args[0]);
      while (n > 0) {
        @SuppressWarnings("unused")
        int i = 0;
        sum = sum + n;
        i++;
        n--;

      }
      System.out.println("The value of sum of Number is:" + sum);
    } catch (NumberFormatException e) {
      System.out.println(e.getMessage());
      System.out.println("please enter the Integer Format");
    }
  }

}