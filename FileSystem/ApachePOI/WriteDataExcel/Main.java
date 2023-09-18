package FileSystem.ApachePOI.WriteDataExcel;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
public class Main {
  public static void main(String[] args) {
    String excelFilePath = "E:/Project/Learning-java-core/FileSystem/ApachePOI/WriteDataExcel/file.xlsx";

    try (Workbook workbook = new XSSFWorkbook();
         FileOutputStream fos = new FileOutputStream(new File(excelFilePath))) {

      Sheet sheet = workbook.createSheet("Tuan-Sheet");

      // Tạo dữ liệu mẫu
      String[][] data = {
          {"Tên", "Tuổi"},
          {"John", "30"},
          {"Alice", "25"},
          {"Bob", "28"}
      };
      // Ghi dữ liệu vào tệp Excel
      int rowNum = 0;
      for (Object[] rowData : data) {
        Row row = sheet.createRow(rowNum++);
        int colNum = 0;
        for (Object field : rowData) {
          Cell cell = row.createCell(colNum++);
          if (field instanceof String) {
            cell.setCellValue((String) field);
          } else if (field instanceof Integer) {
            cell.setCellValue((Integer) field);
          }
        }
      }

      // Lưu tệp Excel
      workbook.write(fos);
      System.out.println("Dữ liệu đã được ghi vào tệp Excel thành công.");

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
