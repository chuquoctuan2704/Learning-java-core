package StringBasic;

public class StringReplace {
  public static void main(String[] args) {
    String a = "this is String a";

    String b = a.replace("is", "b");
    System.out.println("b: " + b);

    String c = a.replaceAll("is", "c");
    System.out.println("c: " + c);

    String d = a.replaceFirst("is", "d");
    System.out.println("d: " + d);
  }
}
