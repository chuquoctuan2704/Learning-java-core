package FileSystem.ApacheCommonsIO;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Main {
  public static void main(String[] args) {
    File sourceFile = new File("E:/Project/Learning-java-core/ExceptionHandling/file.txt");
    File destinationFile = new File("E:/Project/Learning-java-core/FileSystem/ApacheCommonsIO/CopyFile/destination.txt");

    try {
      FileUtils.copyFile(sourceFile, destinationFile);
      System.out.println("Tệp tin đã được sao chép thành công.");
    } catch (IOException e) {
      System.err.println("Lỗi khi sao chép tệp tin: " + e.getMessage());
    }

    // đọc tập tin
    try {
      List<String> lines = FileUtils.readLines(destinationFile, "UTF-8");
      for (String line : lines) {
        System.out.println(line);
      }
    } catch (IOException e) {
      System.err.println("Lỗi khi đọc tệp tin: " + e.getMessage());
    }

    /// Xóa thư mục và tập tin bên trong
    File directory = new File("my_directory");

    try {
      FileUtils.deleteDirectory(directory);
      System.out.println("Thư mục đã bị xóa thành công.");
    } catch (IOException e) {
      System.err.println("Lỗi khi xóa thư mục: " + e.getMessage());
    }
  }
}
