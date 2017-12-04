package in.vamsoft.training.oops;

public abstract class Car extends Vehicle {

  public Car() {
    System.out.println("Car.Car()");
  }

  @Override
  public void start() {
    System.out.println("Car.start()");
  }

  public void handBrake() {
    System.out.println("Car.handBrake()");
  }
}
