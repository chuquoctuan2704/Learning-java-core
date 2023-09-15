package RegularExpressions.DotOperator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
  public static void main(String[] args) {
    String demo1 = "ab";
    String demo2 = "aXb";
    String demo3 = "aXXXb";

    System.out.println("-----------------------------");
    System.out.println("Kiểm tra có a...b");
    String regex1 = "a.b";
    Pattern pattern1 = Pattern.compile(regex1);
    Matcher matcher1 = pattern1.matcher(demo1);
    Matcher matcher2 = pattern1.matcher(demo2);
    Matcher matcher3 = pattern1.matcher(demo3);

    System.out.println(matcher1.find());
    System.out.println(matcher2.find());
    System.out.println(matcher3.find());

    System.out.println("-----------------------------");
    System.out.println("Kiểm tra có có hoặc không a...b");
    String regex2 = "a.*b";
    Pattern pattern2 = Pattern.compile(regex2);
    Matcher matcher21 = pattern2.matcher(demo1);
    Matcher matcher22 = pattern2.matcher(demo2);
    Matcher matcher23 = pattern2.matcher(demo3);

    System.out.println(matcher21.find());
    System.out.println(matcher22.find());
    System.out.println(matcher23.find());
  }
}
