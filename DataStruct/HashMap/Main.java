package DataStruct.HashMap;

import java.util.HashMap;
import java.util.Map;

// HashMap trong Java là một cấu trúc dữ liệu thư viện, được sử dụng để lưu trữ và quản lý các cặp key-value (khóa-giá trị)

public class Main {
  public static void main(String[] args) {
    // Tạo một đối tượng HashMap
    Map<String, Integer> hashMap = new HashMap<>();

    // Thêm các cặp key-value vào HashMap
    hashMap.put("apple", 5);
    hashMap.put("banana", 3);
    hashMap.put("cherry", 7);
    hashMap.put("tomato", 1);
    hashMap.put("potato", 8);

    // Truy xuất giá trị dựa trên key
    int numberOfApples = hashMap.get("apple");
    System.out.println("Number of apples: " + numberOfApples);

    // Kiểm tra sự tồn tại của một key trong HashMap
    boolean containsBanana = hashMap.containsKey("banana");
    System.out.println("Contains banana: " + containsBanana);

    // Lặp qua tất cả các cặp key-value trong HashMap
    for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
      String key = entry.getKey();
      int value = entry.getValue();
      System.out.println("Key: " + key + ", Value: " + value);
    }
  }
}
