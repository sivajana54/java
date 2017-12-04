package in.vamsoft.training.collection.main;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Sort implements Comparator<Customer> {

  @Override
  public int compare(Customer o1, Customer o2) {
    if (o1.mobile > o2.mobile)
      return 1;
    else if (o1.mobile < o2.mobile) {
      return -1;
    } else {
      return 0;
    }
  }

}

class ShortName implements Comparator<Customer> {

  @Override
  public int compare(Customer o3, Customer o4) {

    return o3.getName().compareToIgnoreCase(o4.getName());
  }
}

public class CustomerMain {
  public static void main(String[] args) {
    Set<Customer> set = new TreeSet<>(new Sort());
    Set<Customer> name = new TreeSet<>(new ShortName());
    Set<Customer> test = new TreeSet<>();
    Customer c1 = new Customer(1, "jana", 900355525, "tirunelveli");
    Customer c2 = new Customer(2, "siva", 822060987, "chennai");
    Customer c3 = new Customer(3, "bala", 971558531, "palayamkottai");
    Customer c4 =new Customer(1, "test", 123456789, "test add");
    set.add(c1);
    set.add(c2);
    set.add(c3);
    set.add(c4);
    test.add(c1);
    test.add(c2);
    test.add(c3);
    test.add(c4);
    name.add(c1);
    name.add(c2);
    name.add(c3);
    name.add(c4);

    System.out.println("First Short by ID" + "------------" + test);
    System.out.println("Secound Short By MobileNumber" + "-------------" + set);
    System.out.println("Third Short By Name" + "-----------" + name);
  }

}
