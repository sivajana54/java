package in.vamsoft.training.watchclock;

/**
 * hello.
 * 
 * @author vamsoft. *
 */
public class AnalogWatch extends Watch implements Alarm {

  @Override
  public void setAlarm() {
    super.setAlarm();
  }

  @Override
  public void ringAlarm() {
    System.out.println("AnalogWatch.ringAlarm()");
  }

  @Override
  public void hourElapsed() {
    System.out.println("AnalogWatch.hourElapsed()");
  }

  @Override
  public void minitueElapsed() {
    super.minitueElapsed();
  }
}

