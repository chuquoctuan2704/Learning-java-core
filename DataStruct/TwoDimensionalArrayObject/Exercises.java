package DataStruct.TwoDimensionalArrayObject;

import java.util.Scanner;

public class Exercises {
  public static void main(String[] args) {
    ObjectModel[][] arr2DimName = new ObjectModel[3][3];
    Scanner scanner = new Scanner(System.in);

    int action = -1;
    System.out.println("===============================================");
    for (int i = 0; i < arr2DimName.length; i++) {
      for (int j = 0; j < arr2DimName[i].length; j++) {
        System.out.print("Nhập tên cho vị trí " + (i + 1) + "." + (j + 1) + ": ");
        String name = scanner.next();

        arr2DimName[i][j] = new ObjectModel(name);
      }
    }

    while (action != 0) {
      if (action == 1) {
        showList(arr2DimName);
        System.out.println("Chọn người cần sửa");
        System.out.print("Hàng:");
        int row = scanner.nextInt() - 1;
        System.out.print("cột:");
        int column = scanner.nextInt() - 1;

        if (row >= 0 && row < arr2DimName.length && column >= 0 && column < arr2DimName[row].length) {
          System.out.print("Nhập tên mới: ");
          String editName = scanner.next();
          arr2DimName[row][column].setName(editName);;
        } else {
          System.out.println("Lỗi khi chọn người dùng");
        }
      } else if (action == 2) {
        showList(arr2DimName);
      }

      System.out.println("===============================================");
      System.out.println("Chọn tính năng");
      System.out.println("Nhập 0 - Thoát và hiển thị danh sách");
      System.out.println("Nhập 1 - Sửa tên người dùng");
      System.out.println("Nhập 2 - Hiển thị danh sách");
      System.out.print("Nhập số: ");
      int newAction = scanner.nextInt();
      action = newAction;
    }
    scanner.close();

    showList(arr2DimName);
  };

  static void showList(ObjectModel[][] arr2DimName) {
    System.out.println("===============================================");
    System.out.println("Danh sách tên người");

    for (int i = 0; i < arr2DimName.length; i++) {
      for (int j = 0; j < arr2DimName[i].length; j++) {
        System.out.print((i + 1) + "." + (j + 1) + ". " + arr2DimName[i][j].toString() + "    ");
      }
      System.out.println();
    }

  }
}
