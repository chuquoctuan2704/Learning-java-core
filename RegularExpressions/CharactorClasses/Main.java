package RegularExpressions.CharactorClasses;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
  public static void main(String[] args) {
    String text = "@";
    String text2 = "ab";
    String text3 = "19";

    System.out.println("-------------------------");
    System.out.println("Bất kỳ chữ in hoa in thường");

    String regex0 = "[A-Za-z]";
    Pattern pattern0 = Pattern.compile(regex0);
    Matcher matcher0 = pattern0.matcher(text);
    Matcher matcher02 = pattern0.matcher(text2);
    Matcher matcher03 = pattern0.matcher(text3);

    System.out.println(matcher0.find());
    System.out.println(matcher02.find());
    System.out.println(matcher03.find());

    System.out.println("-------------------------");
    System.out.println("Bất kỳ chữ in hoa in thường và số");

    String regex1 = "[A-Za-z0-9]";
    Pattern pattern = Pattern.compile(regex1);
    Matcher matcher1 = pattern.matcher(text);
    Matcher matcher12 = pattern.matcher(text2);
    Matcher matcher13 = pattern.matcher(text3);

    System.out.println(matcher1.find());
    System.out.println(matcher12.find());
    System.out.println(matcher13.find());

    System.out.println("-------------------------");
    System.out.println("Bất kỳ chữ số");

    String regex2 = "[0-9]";
    Pattern pattern2 = Pattern.compile(regex2);
    Matcher matcher2 = pattern2.matcher(text);
    Matcher matcher22 = pattern2.matcher(text2);
    Matcher matcher23 = pattern.matcher(text3);

    System.out.println(matcher2.find());
    System.out.println(matcher22.find());
    System.out.println(matcher23.find());

    System.out.println("-------------------------");
    System.out.println("Bất kỳ ký tự ngoài số");

    String regex3 = "[^0-9]+";
    Pattern pattern3 = Pattern.compile(regex3);
    Matcher matcher3 = pattern3.matcher(text);
    Matcher matcher32 = pattern3.matcher(text2);
    Matcher matcher33 = pattern3.matcher(text3);

    System.out.println(matcher3.find());
    System.out.println(matcher32.find());
    System.out.println(matcher33.find());
  }
}
