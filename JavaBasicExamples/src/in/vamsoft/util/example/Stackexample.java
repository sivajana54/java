package in.vamsoft.util.example;

import java.util.Stack;

public class Stackexample {

  /**Stack Example.
   * @param args.
   */
  public static void main(String[] args) {
    Stack<String> stack = new Stack<String>();

    stack.push("siva");
    stack.push("bala");
    stack.push("jk");
    stack.push("demo");
    System.out.println("Before pop:" + stack);
    stack.pop();
    System.out.println("After pop:" + stack);

  }

}
