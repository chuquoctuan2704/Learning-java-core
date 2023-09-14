package DataStruct.LinkedHashSet;

import java.util.LinkedHashSet;

public class Main {
  public static void main(String[] args) {
        // Tạo một LinkedHashSet lưu trữ chuỗi
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // Thêm phần tử vào LinkedHashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Tomato");

        // Duyệt qua các phần tử trong LinkedHashSet (theo thứ tự thêm vào)
        for (String fruit : set) {
            System.out.println(fruit);
        }
    }
}
