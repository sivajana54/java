package in.vamsoft.training.oops;

public class Plane extends Vehicle implements Flying {

  public Plane() {
    System.out.println("Plane.Plane()");
  }

  @Override
  public void start() {
    System.out.println("Plane.start()");

  }

  @Override
  public void stop() {
    System.out.println("Plane.stop()");

  }

  @Override
  public void brake() {
    System.out.println("Plane.brake()");

  }

  @Override
  public void takeoff() {
    System.out.println("Plane.takeoff()");

  }

  @Override
  public void land() {
    System.out.println("Plane.land()");

  }

}
