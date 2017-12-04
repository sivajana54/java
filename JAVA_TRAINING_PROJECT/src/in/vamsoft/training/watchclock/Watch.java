package in.vamsoft.training.watchclock;

public abstract class Watch extends Clock implements Alarm {

  @Override
  public void minitueElapsed() {
    System.out.println("Watch.minitueElapsed()");

  }

  @Override
  public void setAlarm() {
    System.out.println("Watch.setAlarm()");

  }
}
