package in.vamsoft.training.watchclock;

public interface Ticking {

  int factor = 60;

  void tick();

  void minitueElapsed();

  void hourElapsed();
}
