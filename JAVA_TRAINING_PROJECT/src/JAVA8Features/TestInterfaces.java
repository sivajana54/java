package JAVA8Features;

interface first {
  public default void m1() {
    System.out.println("first interface m1");
  }
}

interface secound {
  public default void m1() {
    System.out.println("secound interface m1");
  }
}

interface third {
  public static void m1() {
    System.out.println("Third interface m1");
  }
}

interface four {
  public void m1();

}

class Test implements first, secound, third {

  @Override
  public void m1() {
    // TODO Auto-generated method stub
    first.super.m1();
  }
}

public class TestInterfaces {
  public static void main(String[] args) {
    Test test = new Test();
    test.m1();
    

  }
}
