package in.vamsoft.util.example;

import java.util.Set;
import java.util.TreeSet;

public class EmployeeSort {

  /** Employee Sort using Comparable interface.
   * @param args.
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Set<Employee> list = new TreeSet<>();

    Employee s1 = new Employee(2, "siva", 002);
    Employee s2 = new Employee(1, "bala", 001);
    Employee s3 = new Employee(3, "demo", 003);
    list.add(s1);
    list.add(s2);
    list.add(s3);

    System.out.println(list);

  }

}
