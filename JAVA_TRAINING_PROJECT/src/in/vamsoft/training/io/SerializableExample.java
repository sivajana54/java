package in.vamsoft.training.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableExample {
  public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
    Employee emp = new Employee("siva", 22);
    ObjectOutputStream objout = new ObjectOutputStream(new FileOutputStream("object.txt"));
    objout.writeObject(emp);
    System.out.println(objout);

    ObjectInputStream objin = new ObjectInputStream(new FileInputStream("object.txt"));
    Employee emp1 = (Employee) objin.readObject();
    System.out.println(emp1);
  }
}