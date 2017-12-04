package JAVA8Features;

import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InbulidFunInterface {

  public static void main(String[] args) {
    Predicate<Integer> evenorOdd = (x) -> x % 2 == 0 ? true : false;
    System.out.println("10 even or odd:" + (evenorOdd.test(10) ? "10 is even" : "10 is odd"));

    Consumer<String> upperDisplay = str -> System.out.println(str.toUpperCase());
    upperDisplay.accept("hai hello welcome to java");

    Function<String, Integer> findLength = (str) -> str.length();
    System.out.println("length" + findLength.apply("sivajana"));

    Supplier<String> getDayOfWeek = () -> LocalDate.now().getDayOfWeek().name();
    System.out.println("Today is:" + getDayOfWeek.get());

  }

}
