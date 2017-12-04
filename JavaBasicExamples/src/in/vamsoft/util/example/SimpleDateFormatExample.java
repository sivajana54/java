package in.vamsoft.util.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample {
  public static void main(String args[]) {
    Date dNow = new Date();
    SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

    System.out.println("Current Date: " + ft.format(dNow));
  }
}