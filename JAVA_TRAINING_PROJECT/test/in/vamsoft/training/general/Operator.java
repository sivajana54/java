package in.vamsoft.training.general;

import javax.swing.JButton;

public class Operator {

  /**
   * @param args.
   */
  public static void main(String[] args) {
    JButton a = new JButton("Exit");
    JButton b = new JButton("Exit");
    JButton c = a;
    System.out.println("Is reference a == b? " + (a == b));
    System.out.println("Is reference a == c? " + (a == c));
  }
}
