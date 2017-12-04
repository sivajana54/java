package in.vamsoft.training.watchclock;

public abstract class Clock implements Ticking {

  public void tick() {
    System.out.println("Clock.tick()");
  }

}
