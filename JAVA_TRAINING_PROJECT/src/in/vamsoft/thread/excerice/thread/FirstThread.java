package in.vamsoft.thread.excerice.thread;

public class FirstThread  extends Thread{
  public void run() {
for(int i=1;i<=1000;i+=5) {
  System.out.println("THE FIRST THREAD" + i);
 
}
}
}