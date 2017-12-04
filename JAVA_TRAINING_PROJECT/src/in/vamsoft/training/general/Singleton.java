package in.vamsoft.training.general;

public class Singleton {
  private static Singleton Singletonobj;

  private Singleton() {
    super();

  }

  public static Singleton getInstance() {
    if (Singletonobj == null) {
      Singletonobj = new Singleton();
    }
    return Singletonobj;

  }

  public void display() {
    System.out.println("display");
  }
}
