package StringBasic;

public class StringSlice {
  public static void main(String[] args) {
    String a = "This is string a";

    String b = a.substring(5);
    String c = a.substring(5, 9);

    System.out.println("string cut from position 5: " + b);

    System.out.println("string cut from position 5 - 9: " + c);
  }
}