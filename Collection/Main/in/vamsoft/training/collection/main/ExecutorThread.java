package in.vamsoft.training.collection.main;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class RThread implements Runnable {
  String jobName;

  @Override
  public void run() {
    for (int i = 1; i <= 10; i++) {
      System.out.println(Thread.currentThread().getName() + "" + i + "" + jobName);
    }

  }

  public RThread(String jobName) {
    super();
    this.jobName = jobName;
  }
}

class CThread implements Callable<Integer> {

  @Override
  public Integer call() throws Exception {
    int sum = 0;
    for (int i = 0; i <= 10; i++) {
      sum += i;
    }
    return sum;
  }

}

public class ExecutorThread {

  public static void main(String[] args) throws InterruptedException, ExecutionException {

    ExecutorService service = Executors.newFixedThreadPool(2);
    service.execute(new RThread("job1"));
    service.execute(new RThread("job2"));
    service.execute(new RThread("job3"));
    service.execute(new RThread("job4"));
    service.execute(new RThread("job5"));
    Future<Integer> result = service.submit(new CThread());
    System.out.println(result.get());
    service.shutdown();
  }

}



