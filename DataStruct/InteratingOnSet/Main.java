package DataStruct.InteratingOnSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Set là một tập hợp các phần tử không trùng lặp, cũng không thể truy cập bằng chỉ số

public class Main {
  public static void main(String[] args) {
    Set<String> set = new HashSet<>();
    set.add("Apple");
    set.add("Banana");
    set.add("Cherry");
    set.add("Tomato");
    set.add("Potato");

    Iterator<String> iterator = set.iterator();
    while (iterator.hasNext()) {
      String element = iterator.next();
      System.out.println(element);
    }

    System.out.println("--------------------------");
    for (String element : set) {
      System.out.println(element);
    }

    System.out.println("--------------------------");
    set.forEach(element -> {
      System.out.println(element);
    });

    System.out.println("--------------------------");
    set.stream().forEach(element -> {
      System.out.println(element);
    });
  }
}
