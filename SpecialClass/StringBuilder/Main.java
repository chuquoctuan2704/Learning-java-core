package SpecialClass.StringBuilder;

public class Main {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("Hello");
    // nối chuỗi
    sb.append(" World");
    System.out.println(sb);

    // chèn chuỗi
    sb.insert(5, " Beautiful");
    System.out.println(sb);

    // Xóa chuỗi
    sb.delete(5, 15);
    System.out.println(sb);

    // thay thế chuỗi theo vị trí
    sb.replace(0, 5, "Hi");
    System.out.println(sb);

    // Đảo ngược chuỗi
    sb.reverse();
    System.out.println(sb.toString());
  }
}
