package NestedIfCondition;

public class NestedIfCondition {
  public static void main(String[] args) {
    int a = 10;
    int b = 5;
    int c = 4;

    if (a > b) {
      if (b > c) {
        System.out.println("is DESC");
      } else {
        System.out.println(false);
      }
    } else {
      System.out.println(false);
    }
  }
}
