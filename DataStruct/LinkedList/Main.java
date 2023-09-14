package DataStruct.LinkedList;

import java.util.LinkedList;

// Kích thước động cơ: Giống ArrayList, LinkedList cung cấp kích thước động cho việc thêm và xóa phần tử.
// Thích hợp cho thêm/xóa: LinkedList hiệu quả hơn ArrayList cho các thao tác thêm và xóa phần tử ở giữa danh sách vì nó không cần sao chép toàn bộ danh sách như ArrayList khi thay đổi kích thước.
// Không đồng nhất: Phần tử trong LinkedList không được lưu trữ liên tiếp trong bộ nhớ và được liên kết bởi các tham chiếu, điều này có thể làm tăng thời gian truy cập.

public class Main {
  public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<String>();

    list.add("element 1");
    list.add("element 2");
    list.add("element 3");
    list.add("element 4");

    for (String string : list) {
      System.out.println(string);
    }
    System.out.println("--------------");

    list.set(1, "element new");

    for (String string : list) {
      System.out.println(string);
    }
  }
}
