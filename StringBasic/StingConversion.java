package StringBasic;

public class StingConversion {
  public static void main(String[] args) {
    int num = 4;

    String numToString = Integer.toString(num);
    System.out.println("num to String: " + numToString + 2);

    String numString = "" + num;
    System.out.println("Num + String: " + numString);

  }
}
