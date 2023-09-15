package ExceptionHandling;

public class Exception {
  public static void main(String[] args) {
    int a = 0;
    int b = 10;

    try {
      int c = b / a;
      System.out.println(c);
    } catch (ArithmeticException e) {
      int c = a / b;
      System.out.println("This is Exception");
      System.out.println(c);
    } finally {
      System.out.println("This is finally");
    }
  }
}
