package DataStruct.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class Main {
  public static void main(String[] args) {
        // Tạo một đối tượng TreeMap
        Map<String, Integer> treeMap = new TreeMap<>();

        // Thêm các cặp key-value vào TreeMap
        treeMap.put("apple", 5);
        treeMap.put("banana", 3);
        treeMap.put("cherry", 7);
        treeMap.put("tomato", 1);
        treeMap.put("potato", 8);

        // Truy xuất giá trị dựa trên key (đã sắp xếp)
        int numberOfApples = treeMap.get("apple");
        System.out.println("Number of apples: " + numberOfApples);

        // Kiểm tra sự tồn tại của một key trong TreeMap
        boolean containsBanana = treeMap.containsKey("banana");
        System.out.println("Contains banana: " + containsBanana);

        // Lặp qua tất cả các cặp key-value trong TreeMap (theo thứ tự)
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}
