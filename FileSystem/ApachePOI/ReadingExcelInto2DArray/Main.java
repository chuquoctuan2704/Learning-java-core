package FileSystem.ApachePOI.ReadingExcelInto2DArray;

import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
public class Main {
  public static void main(String[] args) {
    String excelFilePath = "E:/Project/Learning-java-core/FileSystem/ApachePOI/ReadingExcelInto2DArray/file.xlsx";

    try (FileInputStream fis = new FileInputStream(new File(excelFilePath));
         Workbook workbook = WorkbookFactory.create(fis)) {

      // Get the first sheet from the workbook
      Sheet sheet = workbook.getSheetAt(0);

      int numRows = sheet.getPhysicalNumberOfRows();
      int numCols = sheet.getRow(0).getPhysicalNumberOfCells();

      String[][] data = new String[numRows][numCols];

      // Iterate through rows and columns to read data into the 2D array
      for (int rowNum = 0; rowNum < numRows; rowNum++) {
        Row row = sheet.getRow(rowNum);
        for (int colNum = 0; colNum < numCols; colNum++) {
          Cell cell = row.getCell(colNum);
          if (cell != null) {
            switch (cell.getCellType()) {
              case STRING:
                data[rowNum][colNum] = cell.getStringCellValue();
                break;
              case NUMERIC:
                data[rowNum][colNum] = String.valueOf(cell.getNumericCellValue());
                break;
              case BOOLEAN:
                data[rowNum][colNum] = String.valueOf(cell.getBooleanCellValue());
                break;
              default:
                data[rowNum][colNum] = "";
            }
          } else {
            data[rowNum][colNum] = ""; // Handle empty cells
          }
        }
      }

      System.out.println("2D Array");
      // Print the 2D array
      for (int i = 0; i < numRows; i++) {
        for (int j = 0; j < numCols; j++) {
          System.out.print(data[i][j] + ",\t");
        }
        System.out.println(); // Move to the next row
      }

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
