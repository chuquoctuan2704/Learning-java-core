package RegularExpressions.HandsOnExercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int action = 1;
    String emailRegex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}";
    Pattern pattern = Pattern.compile(emailRegex);

    while (action != 0) {
      System.out.println("--------------------------------------");
      System.out.print("Nhap email: ");
      String email = scanner.next();
      Matcher matcher = pattern.matcher(email);

      System.out.println(matcher.find() ? "Dung dinh dang Email" : "Khong dung dinh dang email");

      System.out.println("--------------------------------------");
      System.out.print("Nhap 1 de thu lai, nhap 0 de thoat: ");
      action = scanner.nextInt();
    }
    scanner.close();
  }
}
