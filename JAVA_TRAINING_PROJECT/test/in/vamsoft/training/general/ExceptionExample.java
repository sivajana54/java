package in.vamsoft.training.general;

public class ExceptionExample {
  /**
   * @param args more than exception 
.
   */
  public static void main(String[] args) {
    int a = 0;
    int b = 0;

    try {

      a = Integer.parseInt(args[0]);
      b = Integer.parseInt(args[1]);
      int result = a / b;
      System.out.println("result" + result);
    } catch (ArithmeticException | NumberFormatException ex) {
      System.out.println("the error is" + ex.getMessage());
    } catch (ArrayIndexOutOfBoundsException ex) {
      System.out.println("the erroe is" + ex.getMessage());
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
