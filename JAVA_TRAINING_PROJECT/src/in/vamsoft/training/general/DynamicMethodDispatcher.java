package in.vamsoft.training.general;

class A {
  public void m1() {
    System.out.println("m1 in A");

  }
}

class B extends A {
  public void m2() {
    System.out.println("m2 in B");
  }
}

class C extends B {
  public void m2() {
    System.out.println("m2 in C");
  }

  public void m3() {
    System.out.println("m3 in C");
  }
}
