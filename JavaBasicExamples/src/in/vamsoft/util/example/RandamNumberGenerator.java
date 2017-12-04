package in.vamsoft.util.example;

import java.util.Random;

public class RandamNumberGenerator {

  public static void main(String[] args) {
    System.out.println("Generating random integers in the range 1..10.");

    int start = 1;
    int end = 10;
    Random random = new Random();
    for (int idx = 1; idx <= 10; ++idx) {
      showRandomInteger(start, end, random);
    }

    System.out.println("Done.");
  }

  private static void showRandomInteger(int astart, int aend, Random aRandom) {

    try {
      if (astart > aend) {

        throw new IllegalArgumentException();
      }
      long range = (long) aend - (long) astart + 1;
      
      long fraction = (long) (range * aRandom.nextDouble());

      long randomNumber = (long) (fraction + astart);
      
      System.out.println("Generated : " + randomNumber);
      
    } catch (IllegalArgumentException e) {
      System.out.println(e);
    }
  }
}
