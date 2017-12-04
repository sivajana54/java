package in.vamsoft.training.watchclock;

public class DigitalWatch extends Watch implements StopWatch {

  public void hourElapsed() {
    System.out.println("DigitalWatch.hourElapsed()");

  }

  @Override
  public void lapTimer() {
    System.out.println("DigitalWatch.lapTimer()");

  }

  @Override
  public void pause() {
    System.out.println("DigitalWatch.pause()");

  }

  public void ringAlarm() {
    System.out.println("DigitalWatch.ringAlarm()");

  }

  @Override
  public void start() {
    System.out.println("DigitalWatch.start()");

  }

  @Override
  public void stop() {
    System.out.println("DigitalWatch.stop()");

  }

  public void setAlarm() {
    System.out.println("DigitalWatch.setAlarm()");
    super.setAlarm();
  }

}
