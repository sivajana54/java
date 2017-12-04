package in.vamsoft.training.general;

public class DynamicDispatcherMain {
  public static void main(String[] args) {
    A a = new A();
    a.m1();
    B b = new B();
    b.m1();
    b.m2();
    C c = new C();
    c.m1();
    c.m2();
    c.m3();
    
  }

}
