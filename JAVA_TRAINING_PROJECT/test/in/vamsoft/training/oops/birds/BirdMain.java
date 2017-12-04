package in.vamsoft.training.oops.birds;

import in.vamsoft.training.birds.Crow;

public class BirdMain {
  public static void main(String[] args) {
    Crow c = new Crow();
    c.eat();
    c.fly();
    c.talk();
    c.talk("10");

  }
}
