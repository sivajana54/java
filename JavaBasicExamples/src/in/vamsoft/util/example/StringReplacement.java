package in.vamsoft.util.example;

public class StringReplacement {

  /**Replace a string program.
   * @param args.
   */
  public static void main(String[] args) {
    String s1 = "dddddabcdwwwww abcdooooooabcdmmmmmm";
    String replaceString = s1.replace("abcd", "a-d");
    System.out.println(replaceString);
  }

}
