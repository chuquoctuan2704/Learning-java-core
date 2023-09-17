package SpecialClass.MathClass;

public class Main {
  public static void main(String[] args) {
    double pi = Math.PI;
    System.out.println("Pi: " + pi);

    int abs = -50;
    System.out.println("Trị tuyệt đối là: " + Math.abs(abs));

    int sqrt = 25;
    System.out.println("Căn bậc 2: " + Math.sqrt(sqrt));

    double ceil = 0.55;
    System.out.println("Làm tròn số lên: " + Math.ceil(ceil));

    double floor = 0.55;
    System.out.println("Làm tròn số lên: " + Math.floor(floor));

    System.out.println("Số ngẫu nhiên: " + Math.random());
  }
}
