package JAVA8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamUsingJavaEight {
  public static void main(String[] args) {

    Book b1 = new Book(1, "java", 300, "siva");
    Book b2 = new Book(2, ".net", 200, "jana");
    Book b3 = new Book(3, "HTML", 100, "sivajana");
    List<Book> myBooks = Arrays.asList(b1, b2, b3);
    Stream<Book> books = myBooks.stream();
    Stream<Book> goodBooks = books.filter(b -> b.getBookrate() > 200);
    goodBooks.forEach(b -> System.out.println(b.toString()));

    // String upperCase = books.map(Book::getBookauthor).
    myBooks.stream().map(b -> (b.getBookauthor()).toUpperCase()).forEach(t -> System.out.println(t));
  }
}
