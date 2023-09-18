package SpecialClass.RandomClass;

import java.util.Random;

public class Main {
  public static void main(String[] args) {
    Random random = new Random();

    // ngẫu nhiên trong 10 số bắt đầu từ số 0
    int randomInt = random.nextInt(10);
    System.out.println(randomInt);

    double randomDouble = random.nextDouble();
    System.out.println(randomDouble);

    boolean randomBoolean = random.nextBoolean();
    System.out.println(randomBoolean);

    int min = 10;
    int max = 20;
    int randomInRange = random.nextInt(max - min + 1) + min;
    System.out.println(randomInRange);
  }
}
