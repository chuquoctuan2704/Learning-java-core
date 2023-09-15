package RegularExpressions.RegularizingNumberRages;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
  public static void main(String[] args) {
    String number = "01 10 15 25 30 99 100 55555";

    String regexRange = "(?:[1-9]\\d*)";

    Pattern pattern = Pattern.compile(regexRange);
    Matcher matcher = pattern.matcher(number);
    while (matcher.find()) {
      String matchedNumber = matcher.group();
      System.out.println(matchedNumber);
    }
  }
}
