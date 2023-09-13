package OOP.Method;

// nạp chồng phương thức: có tên giống nhau nhưng số lượng tham số khác nhau hoặc kiểu tham số khác nhau

public class MethodOverloading {
  static int a = 5;

  public static void main(String[] args) {
    System.out.println("init Number: " + a);

    System.out.println("increaseNumber: " + increaseNumber(10));

    System.out.println("increaseNumber Overloading: " + increaseNumber(10, 10));
  }

  static int increaseNumber(int num) {
    return a + num;
  }

  static int increaseNumber(int num, int num2) {
    return a + num + num2;
  }
}
