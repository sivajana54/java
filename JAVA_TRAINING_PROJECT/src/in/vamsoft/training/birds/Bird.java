package in.vamsoft.training.birds;

public abstract class Bird implements Flying, Talking, Eating {

  public void eat() {
    System.out.println("Bird.eat()");
  }

}
