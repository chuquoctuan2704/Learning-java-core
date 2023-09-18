package SpecialClass.ScannerClass;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Nhap ten cua ban: ");
    String name = scanner.nextLine();

    System.out.print("Nhap tuoi cua ban: ");
    int age = scanner.nextInt();

    System.out.println("Xin chao, " + name + "! Ban da " + age + " tuoi.");
    scanner.close();

    try {
      File file = new File("E:/Project/Learning-java-core/ExceptionHandling/file.txt");
      Scanner scanner2 = new Scanner(file);

      while (scanner2.hasNextLine()) {
        String line = scanner2.nextLine();
        System.out.println(line);
      }

      scanner2.close();
    } catch (FileNotFoundException e) {
      System.out.println("Không tìm thấy tệp tin.");
    }
  }
}
