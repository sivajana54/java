package in.vamsoft.training.watchclock;

public class WallClock extends Clock {

  @Override
  public void hourElapsed() {
    System.out.println("WallClock.hourElapsed()");

  }

  @Override
  public void minitueElapsed() {
    System.out.println("WallClock.minitueElapsed()");

  }
}
