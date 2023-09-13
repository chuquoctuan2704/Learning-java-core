package RelationalOperators;

public class RelationalOperators {
  public static void main(String[] args) {
    int a = 10;
    int b = 5;

    boolean isEqual = a == b;
    System.out.println("isEqual = " + isEqual);

    boolean isNotEqual = a != b;
    System.out.println("isNotEqual = " + isNotEqual);

    boolean isGreaterThan = a > b;
    System.out.println("isGreaterThan = " + isGreaterThan);

    boolean isLessThan = a < b;
    System.out.println("isLessThan = " + isLessThan);

    boolean isGreaterThanOrEqual = a >= b;
    System.out.println("isGreaterThanOrEqual = " + isGreaterThanOrEqual);

    boolean isLessThanOrEqual = a <= b;
    System.out.println("isLessThanOrEqual = " + isLessThanOrEqual);
  }
}
