package DataStruct.ArrayObject;

import java.util.Scanner;

public class Exercises {
  public static void main(String[] args) {
    int length = 5;
    ObjectModel[] listObjectModels = new ObjectModel[length];
    Scanner scanner = new Scanner(System.in);

    int action = -1;
    System.out.println("===============================================");
    for (int i = 0; i < length; i++) {
      System.out.print("Nhập tên: ");
      String name = scanner.next();
      ObjectModel newObjectModel = new ObjectModel(name);
      listObjectModels[i] = newObjectModel;
    }

    while (action != 0) {
      if (action == 1) {
        showList(listObjectModels);
        System.out.print("Chọn người cần sửa: ");
        int editIndex = scanner.nextInt();

        if (editIndex >= 0 && editIndex <= length) {
          // ObjectModel editObjectModel = listObjectModels[editIndex];

          System.out.print("Nhập tên mới: ");
          String editName = scanner.next();

          listObjectModels[editIndex].setName(editName);
          ;
        } else {
          System.out.println("Lỗi khi chọn người dùng");
        }
      } else if (action == 2) {
        showList(listObjectModels);
      }

      System.out.println("===============================================");
      System.out.println("Chọn tính năng");
      System.out.println("Nhập 0 - Thoát và hiển thị danh sách");
      System.out.println("Nhập 1 - Sửa người dùng");
      System.out.println("Nhập 2 - Hiển thị danh sách");
      System.out.print("Nhập số: ");
      int newAction = scanner.nextInt();
      action = newAction;
    }
    scanner.close();

    showList(listObjectModels);
  };

  static void showList(ObjectModel[] listObjectModels) {
    System.out.println("===============================================");
    System.out.println("Danh sách tên người");

    for (int i = 0; i < 5; i++) {
      System.out.println(i + ". " + listObjectModels[i].toString());
    }
  }
}
