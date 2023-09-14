package DataStruct.HashSet;

import java.util.HashSet;

public class Main {
  public static void main(String[] args) {
        // Tạo một HashSet lưu trữ chuỗi
        HashSet<String> set = new HashSet<>();

        // Thêm phần tử vào HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        
        // phần tử bị trùng lặp sẽ bị bỏ qua
        set.add("Banana");
        
        // Kiểm tra xem một phần tử có tồn tại trong HashSet hay không
        boolean containsBanana = set.contains("Banana");
        System.out.println("Ton tai Banana: " + (containsBanana ? "Có" : "Không"));

        // Loại bỏ một phần tử khỏi HashSet
        set.remove("Cherry");

        // Duyệt qua các phần tử trong HashSet
        for (String fruit : set) {
            System.out.println(fruit);
        }
    }
}
