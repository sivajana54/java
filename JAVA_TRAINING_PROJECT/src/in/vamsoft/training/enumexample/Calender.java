package in.vamsoft.training.enumexample;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author vamsoft .
 */
public class Calender {
  public enum Months {
    January(1), February(2), March(3), April(4), May(5), June(6), July(7), August(8), September(9), October(
        10), November(11), December(12);

    private final int value;

    Months(int value) {
      this.value = value;
    }

    public int valueInt() {
      return value;
    }
  }

  /**
   * @param args
   *          the command line arguments.
   */
  public static void main(String[] args) {

    Month month1 = Month.valueOf("FEBRUARY");

    System.out.println(month1.getValue());
    // output: 2
    System.out.println(month1.getDisplayName(TextStyle.FULL, Locale.UK));
    // output: February
  }

}
