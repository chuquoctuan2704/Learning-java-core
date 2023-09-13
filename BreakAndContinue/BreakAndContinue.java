package BreakAndContinue;

public class BreakAndContinue {
  public static void main(String[] args) {
    int countBreak = 0;
    int countContinue = 0;

    while (countBreak < 10) {
      if (countBreak == 5) {
        break;
      }
      System.out.println("Break: " + countBreak);
      countBreak++;
    }

    while (countContinue < 10) {
      countContinue++;
      if (countContinue % 2 == 0) {
        continue;
      } else {
        System.out.println("Continue: " + countContinue);
      }
    }
  }
}
