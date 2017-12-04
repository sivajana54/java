package in.vamsoft.training.oops;

public class SportsCar extends Car {

  public SportsCar() {
    System.out.println("SportsCar.SportsCar()");
  }

  public SportsCar(String model) {
    System.out.println("SportsCar.SportsCar()");
    System.out.println(model);
  }

  @Override
  public void stop() {
    System.out.println("SportsCar.stop()");
  }

  @Override
  public void brake() {
    System.out.println("SportsCar.brake()");
  }

  @Override
  public void start() {
    System.out.println("SportsCar.start()");
  }

  public void fourWheelDrive() {
    System.out.println("SportsCar.fourWheelDrive()");
  }

}
