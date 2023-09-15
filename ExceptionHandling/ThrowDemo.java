package ExceptionHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowDemo {
  public static void main(String[] args) {
    try {
      readFile("E:/Project/Learning-java-core/ExceptionHandling/file.txt");
    } catch (FileNotFoundException e) {
      System.out.println("Xu ly IOException 1: " + e.getMessage());
    } catch (IOException e) {
      System.out.println("Xu ly IOException 2: " + e.getMessage());
    } finally {
      System.out.println("Finally đều sẽ chạy dù có xuất hiện ngoại lệ hay không.");
    }
  }

  public static void readFile(String fileName) throws IOException, FileNotFoundException {
    File file = new File(fileName);
    FileReader fileReader = new FileReader(file);
    BufferedReader bufferedReader = new BufferedReader(fileReader);

    String line;
    while ((line = bufferedReader.readLine()) != null) {
      System.out.println(line);
    }

    // Đóng tệp tin sau khi đọc xong
    bufferedReader.close();
  }
}
