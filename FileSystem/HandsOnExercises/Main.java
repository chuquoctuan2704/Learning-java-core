package FileSystem.HandsOnExercises;

import java.io.*;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    String filePath = "E:/Project/Learning-java-core/FileSystem/HandsOnExercises/file.txt";

    File file = new File(filePath);
    Scanner scanner = new Scanner(System.in);

    if (!file.exists()) {
      System.out.println("Tệp tin không tồn tại");
      try {
        file.createNewFile();
        System.out.println("Tạo tệp thành công");
      } catch (IOException e) {
        System.err.println("Lỗi tạo file");
      }
    }
    int action = 1;
    while (action != 0) {
      try {
        StringBuilder fileContent = new StringBuilder();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;

        while ((line = reader.readLine()) != null) {
          fileContent.append(line).append("\n");
        }
        if (action == 1) {
          System.out.println("----------------------------");
          System.out.println("Nội dung file");
          System.out.println(fileContent);
        }

        if (action == 2) {
          BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
          System.out.println("----------------------------");
          System.out.println("Nhập nội dung mới");
          String text = scanner.next();
          fileContent.append(text);

          writer.write(fileContent.toString());
          writer.close();
        }

        if (action == 3) {
          BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
          System.out.println("----------------------------");
          System.out.println("Nhập nội dung cần sửa");
          String text = scanner.next();
          int startIndex = fileContent.indexOf(text);
          if (startIndex != -1) {
            int endIndex = startIndex + text.length();
            System.out.println("Nhập nội dung mới");
            String newText = scanner.next();
            fileContent.replace(startIndex, endIndex, newText);
          } else {
            System.out.println("Nội dung cần sửa không tồn tại");
          }

          writer.write(fileContent.toString());
          writer.close();
        }

        if (action == 4) {
          BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
          System.out.println("----------------------------");

          fileContent.delete(0, fileContent.length());
          System.out.println("Xóa thành công nội dung file");

          writer.write(fileContent.toString());
          writer.close();
        }

        reader.close();
      } catch (IOException e) {
        System.out.println("Lỗi file không tồn tại hoặc đọc file");
      }

      System.out.println("----------------------------");
      System.out.println("Chọn hành động");
      System.out.println("0. thoát");
      System.out.println("1. Hiển thị nội dung file");
      System.out.println("2. thêm text thành dòng mới");
      System.out.println("3. Sửa text");
      System.out.println("4. Xóa hết text");
      System.out.print("Nhập số: ");
      action = scanner.nextInt();
    }
    scanner.close();
  }
}
