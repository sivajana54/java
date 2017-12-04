package in.vamsoft.training.watchclock;

public class TableClock extends Clock implements Alarm {
  @Override
  public void hourElapsed() {
    System.out.println("TableClock.hourElapsed()");

  }

  @Override
  public void minitueElapsed() {
    System.out.println("TableClock.minitueElapsed()");

  }

  @Override
  public void ringAlarm() {
    System.out.println("TableClock.ringAlarm()");

  }

  @Override
  public void setAlarm() {
    System.out.println("TableClock.setAlarm()");

  }
}
