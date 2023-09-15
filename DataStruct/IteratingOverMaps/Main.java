package DataStruct.IteratingOverMaps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<>();
    map.put("apple", 5);
    map.put("banana", 3);
    map.put("cherry", 7);

    // sử dụng iterator
    Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
    while (iterator.hasNext()) {
      Map.Entry<String, Integer> entry = iterator.next();
      String key = entry.getKey();
      Integer value = entry.getValue();
      System.out.println("Key: " + key + ", Value: " + value);
    }
    System.out.println();
    // sử dụng for
    for (String key : map.keySet()) {
      Integer value = map.get(key);
      System.out.println("Key: " + key + ", Value: " + value);
    }
    System.out.println();
    // sử dụng forEach
    map.forEach((key, value) -> {
      System.out.println("Key: " + key + ", Value: " + value);
    });
  }
}
