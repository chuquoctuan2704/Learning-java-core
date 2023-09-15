package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
  public static void main(String[] args) {
    String text = "Hello, my email is example@gmail.com and my phone number is +84987654321.";

    // Tìm kiếm email trong văn bản
    String emailPattern = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}";
    Pattern pattern = Pattern.compile(emailPattern);
    Matcher matcher = pattern.matcher(text);

    while (matcher.find()) {
      String email = matcher.group();
      System.out.println("Email: " + email);
    }

    // Tìm kiếm số điện thoại trong văn bản
    String phonePattern = "((0|\\+84)(9|8|7))[0-9]{8}";
    pattern = Pattern.compile(phonePattern);
    matcher = pattern.matcher(text);

    while (matcher.find()) {
      String phone = matcher.group();
      System.out.println("Phone number: " + phone);
    }
  }
}
