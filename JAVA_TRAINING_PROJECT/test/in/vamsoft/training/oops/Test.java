package in.vamsoft.training.oops;

public class Test {

  /**
   * @param args
   *          .
   */
  public static void main(String[] args) {

    SportsCar car = new SportsCar("suv");

    car.handBrake();
    car.fourWheelDrive();

    System.out.println(car);

  }

}
