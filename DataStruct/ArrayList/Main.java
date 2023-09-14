package DataStruct.ArrayList;

import java.util.ArrayList;

// Kích thước động: ArrayList cung cấp kích thước động, tức là bạn có thể thêm hoặc xóa phần tử một cách linh hoạt mà không cần lo lắng về kích thước ban đầu.
// Tương tự mảng: Mặc dù ArrayList là một cấu trúc dữ liệu động, nhưng nó được triển khai bằng mảng nên có sự tương tự về hiệu suất trong các thao tác đọc và ghi trực tiếp.

public class Main {
  public static void main(String[] args) {
    ArrayList<String> arrayList = new ArrayList<>();

    arrayList.add("arr1");
    arrayList.add("arr2");
    arrayList.add("arr3");

    for (String string : arrayList) {
      System.out.println(string);
    }
  }
}
