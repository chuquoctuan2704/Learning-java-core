package FileSystem.ReadFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Example read file with FileReader and BuffedReader
    try {
      // Tạo một đối tượng File đại diện cho tệp tin
      File file = new File("E:/Project/Learning-java-core/ExceptionHandling/file.txt");

      // Tạo một FileReader để đọc tệp tin
      FileReader fileReader = new FileReader(file);

      // Tạo một BufferedReader để đọc nội dung tệp tin một cách hiệu quả
      BufferedReader bufferedReader = new BufferedReader(fileReader);

      System.out.println("FileReader and BuffedReader:");
      String line;
      // Đọc từng dòng của tệp tin và hiển thị ra màn hình
      while ((line = bufferedReader.readLine()) != null) {
        System.out.println(line);
      }

      // Đóng các luồng
      bufferedReader.close();
      fileReader.close();
    } catch (IOException e) {
      System.out.println("Xảy ra lỗi khi đọc tệp tin: " + e.getMessage());
    }

    // đọc file với Scanner
    try {
      File file = new File("E:/Project/Learning-java-core/ExceptionHandling/file.txt");
      Scanner scanner2 = new Scanner(file);

      System.out.println();
      System.out.println("Scanner: ");

      while (scanner2.hasNextLine()) {
        String line = scanner2.nextLine();
        System.out.println(line);
      }

      scanner2.close();
    } catch (IOException e) {
      System.out.println("Xảy ra lỗi khi đọc tệp tin: " + e.getMessage());
    }
  }
}
