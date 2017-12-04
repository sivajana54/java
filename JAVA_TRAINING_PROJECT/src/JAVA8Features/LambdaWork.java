package JAVA8Features;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Book {
  int bookid;
  String bookname;
  double bookrate;
  String bookauthor;

  public Book() {
    super();
    // TODO Auto-generated constructor stub
  }

  public Book(int bookid, String bookname, double bookrate, String bookauthor) {
    super();
    this.bookid = bookid;
    this.bookname = bookname;
    this.bookrate = bookrate;
    this.bookauthor = bookauthor;
  }

  public int getBookid() {
    return bookid;
  }

  public void setBookid(int bookid) {
    this.bookid = bookid;
  }

  public String getBookname() {
    return bookname;
  }

  public void setBookname(String bookname) {
    this.bookname = bookname;
  }

  public double getBookrate() {
    return bookrate;
  }

  public void setBookrate(double bookrate) {
    this.bookrate = bookrate;
  }

  public String getBookauthor() {
    return bookauthor;
  }

  public void setBookauthor(String bookauthor) {
    this.bookauthor = bookauthor;
  }

  @Override
  public String toString() {
    return "book [bookid=" + bookid + ", bookname=" + bookname + ", bookrate=" + bookrate + ", bookauthor=" + bookauthor
        + "]\n";
  }

}

public class LambdaWork {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Book b1 = new Book(1, "java", 300, "siva");
    Book b2 = new Book(2, ".net", 200, "jana");
    Book b3 = new Book(3, "HTML", 100, "sivajana");
    List<Book> book = Arrays.asList(b1, b2, b3);

    Collections.sort(book, (Book obj1, Book obj2) -> {
      return obj1.getBookauthor().compareTo(obj2.getBookauthor());
    });
    System.out.println(book);
    Collections.sort(book, (obj1, obj2) -> obj1.getBookname().compareTo(obj2.getBookname()));
    System.out.println(book);

    Collections.sort(book, (obj1, obj2) -> ((Double) obj1.getBookrate()).compareTo((Double) obj2.getBookrate()));
    System.out.println(book);
  }
}
