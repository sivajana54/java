package in.vamsoft.util.example;

import java.util.StringTokenizer;

public class Stringtokenzier {

  public static void main(String[] args) {
    StringTokenizer st = new StringTokenizer("my name is siva", " ");
    while (st.hasMoreTokens()) {
      System.out.println(st.nextToken());
    }

  }

}
