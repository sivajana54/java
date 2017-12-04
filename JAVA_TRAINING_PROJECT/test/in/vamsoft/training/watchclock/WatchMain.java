package in.vamsoft.training.watchclock;

import in.vamsoft.training.watchclock.AnalogWatch;
import in.vamsoft.training.watchclock.DigitalWatch;

public class WatchMain {

  /**
   * @param args
   *          .
   */
  public static void main(String[] args) {

    DigitalWatch dw = new DigitalWatch();
    dw.hourElapsed();
    AnalogWatch aw = new AnalogWatch();
    aw.hourElapsed();
    System.out.println("aw.hourElapsed()");

  }

}
