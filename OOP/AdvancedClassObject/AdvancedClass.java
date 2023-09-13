package OOP.AdvancedClassObject;

import java.util.ArrayList;
import java.util.Scanner;

public class AdvancedClass {
  public static void main(String[] args) {
    ArrayList<PersonalModel> listPersonal = new ArrayList<PersonalModel>();
    Scanner scanner = new Scanner(System.in);

    int action = 1;

    while (action != 0) {
      if (action == 1) {
        System.out.println("===============================================");
        System.out.println("Nhập thông tin người dùng");
        System.out.print("Nhập tên: ");
        String name = scanner.next();
        System.out.print("Nhập tuổi: ");
        int age = scanner.nextInt();

        PersonalModel newPersonalModel = new PersonalModel(name, age);
        listPersonal.add(newPersonalModel);
      } else if (action == 2) {
        showList(listPersonal);
        System.out.print("Chọn người cần sửa: ");
        int editIndex = scanner.nextInt();

        if (editIndex >= 0 && editIndex <= listPersonal.size()) {
          PersonalModel editPersonalModel = listPersonal.get(editIndex);

          System.out.print("Nhập tên: ");
          String editName = scanner.next();

          System.out.print("Nhập tuổi: ");
          int editAge = scanner.nextInt();

          editPersonalModel.setName(editName);
          editPersonalModel.setAge(editAge);

          listPersonal.set(editIndex, editPersonalModel);
        } else {
          System.out.println("Lỗi khi chọn người dùng");
        }
      } else if (action == 3) {
        showList(listPersonal);
        System.out.print("Nhập vị trí muốn xóa");
        int index = scanner.nextInt();

        if (index >= 0 && index <= listPersonal.size()) {
          listPersonal.remove(index);
        } else {
          System.out.println("Lỗi khi chọn người dùng");
        }
      }

      System.out.println("===============================================");
      System.out.println("Chọn tính năng");
      System.out.println("Nhập 0 - Thoát và hiển thị danh sách");
      System.out.println("Nhập 1 - Thêm mới người dùng");
      System.out.println("Nhập 2 - Sửa người dùng");
      System.out.println("Nhập 3 - Xóa người dùng");
      System.out.print("Nhập số: ");
      int newAction = scanner.nextInt();
      action = newAction;
    }
      scanner.close();

    showList(listPersonal);
  };

  static void showList(ArrayList<PersonalModel> listPersonal) {
    System.out.println("===============================================");
    System.out.println("Danh sách người dùng");

    for (int i = 0; i < listPersonal.size(); i++) {
      System.out.println(i + ". " + listPersonal.get(i).toString());
    }
  }
}