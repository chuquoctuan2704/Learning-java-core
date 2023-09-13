package StringBasic;

public class StringComparison {
  public static void main(String[] args) {
    String a = "this is String a";
    String a2 = "this is String A";

    boolean areEqual = a.equals(a2);
    boolean areEqualsIgnoreCase = a.equalsIgnoreCase(a2);

    System.out.println("equal: " + areEqual);
    System.out.println("equalsIgnoreCase: "+ areEqualsIgnoreCase);
  }
}