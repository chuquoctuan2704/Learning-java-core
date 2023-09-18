package FileSystem.CopyAndMove;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Main {
  public static void main(String[] args) {
    String filePath = "E:/Project/Learning-java-core/FileSystem/CopyAndMove/file.txt";
    String destinationFilePath = "E:/Project/Learning-java-core/FileSystem/CopyAndMove/new/file.txt";

    // Move
    try {
      File sourceFile = new File(filePath);
      File destinationFile = new File(destinationFilePath);

      // Di chuyển tệp tin từ nguồn đến đích (đổi tên)
      boolean success = sourceFile.renameTo(destinationFile);

      if (success) {
        System.out.println("Di chuyển và đổi tên tệp tin thành công.");
      } else {
        System.out.println("Không thể di chuyển và đổi tên tệp tin.");
      }
    } catch (Exception e) {
      System.err.println("Lỗi khi di chuyển và đổi tên tệp tin: " + e.getMessage());
    }

    // copy
    try {
      File sourceFile = new File(filePath);
      File destinationFile = new File(destinationFilePath);

      // Sao chép tệp tin từ nguồn đến đích
      Files.copy(sourceFile.toPath(), destinationFile.toPath(), StandardCopyOption.REPLACE_EXISTING);

      System.out.println("Sao chép tệp tin thành công.");
    } catch (IOException e) {
      System.err.println("Lỗi khi sao chép tệp tin: " + e.getMessage());
    }
  }
}
