package RegularExpressions.GreedyLazyMatching;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
  public static void main(String[] args) {
    String demo = "abcabc";

    System.out.println("---------------");
    System.out.println("Greedy Matching");
    String regex = "a.*c";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(demo);

    while (matcher.find()) {
      System.out.println(matcher.group());
    }

    System.out.println("---------------");
    System.out.println("Lazy Matching");
    String regex2 = "a.*?c";
    Pattern pattern2 = Pattern.compile(regex2);
    Matcher matcher2 = pattern2.matcher(demo);

    while (matcher2.find()) {
      System.out.println(matcher2.group());
    }
  }
}
