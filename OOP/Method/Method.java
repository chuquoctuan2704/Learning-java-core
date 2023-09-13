package OOP.Method;

public class Method {
  static int a = 5;

  public static void main(String[] args) {
    System.out.println("init Number: " + a);

    increaseNumber();
    System.out.println("increaseNumber: " + a);

    System.out.println("inputIncreaseNumber: " + inputIncreaseNumber(10));
  }

  static void increaseNumber() {
    a++;
  }

  static int inputIncreaseNumber(int num) {
    return a + num;
  }
}
