package FileSystem.EditTextFile;

import java.io.*;

public class Main {
  public static void main(String[] args) {
    String filePath = "E:/Project/Learning-java-core/FileSystem/EditTextFile/file.txt";
    String newText = "This is the new text.";

    try {
      // Đọc nội dung từ tệp tin vào một StringBuilder
      StringBuilder fileContent = new StringBuilder();
      BufferedReader reader = new BufferedReader(new FileReader(filePath));
      String line;
      while ((line = reader.readLine()) != null) {
        fileContent.append(line).append("\n");
      }
      reader.close();

      // Thay đổi nội dung trong StringBuilder
      int startIndex = fileContent.indexOf("old text");
      if (startIndex != -1) {
        int endIndex = startIndex + "old text".length();
        fileContent.replace(startIndex, endIndex, newText);
      }

      fileContent.delete(0, 4);

      fileContent.insert(0, "Created by Tuan \n");

      // Ghi lại nội dung đã thay đổi vào tệp tin
      BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
      writer.write(fileContent.toString());
      writer.close();

      System.out.println("Tệp tin đã được sửa thành công.");
    } catch (IOException e) {
      System.err.println("Lỗi khi sửa tệp tin: " + e.getMessage());
    }
  }
}
