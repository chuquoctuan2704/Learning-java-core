package WhileAndDoWhile;

public class WhileAndDoWhile {
  public static void main(String[] args) {
    int count = 1;

    while (count <= 5) {
      System.out.println("Count: " + count);
      count++;
    }

    do {
      System.out.println("Count2: " + count);
      count++;
    } while (count < 7);

  }
}
