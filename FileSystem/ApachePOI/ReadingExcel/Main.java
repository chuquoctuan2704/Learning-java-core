package FileSystem.ApachePOI.ReadingExcel;

import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
public class Main {
  public static void main(String[] args) {
    String excelFilePath = "E:/Project/Learning-java-core/FileSystem/ApachePOI/ReadingExcel/file.xlsx";

    try (FileInputStream fis = new FileInputStream(new File(excelFilePath));
         Workbook workbook = WorkbookFactory.create(fis)) {

      // Get the first sheet from the workbook
      Sheet sheet = workbook.getSheetAt(0);

      // Iterate through rows and columns to read data
      for (Row row : sheet) {
        for (Cell cell : row) {
          switch (cell.getCellType()) {
            case STRING:
              System.out.print(cell.getStringCellValue() + "\t");
              break;
            case NUMERIC:
              System.out.print(cell.getNumericCellValue() + "\t");
              break;
            case BOOLEAN:
              System.out.print(cell.getBooleanCellValue() + "\t");
              break;
            case BLANK:
              System.out.print("BLANK\t");
              break;
            default:
              System.out.print("UNKNOWN\t");
          }
        }
        System.out.println(); // Move to the next row
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
