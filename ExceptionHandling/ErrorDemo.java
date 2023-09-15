package ExceptionHandling;

// StackOverflowError 

public class ErrorDemo {
  public static void main(String[] args) {
    recursiveFunction(0);
  }

  public static void recursiveFunction(int counter) {
    System.out.println("Counter: " + counter);
    recursiveFunction(counter + 1);
  }
}
