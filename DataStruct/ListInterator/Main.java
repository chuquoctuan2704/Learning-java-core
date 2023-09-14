package DataStruct.ListInterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

// ListIterator đưa mảng thành 1 vòng lặp và giá trị của nó phụ thuộc vào vị trí con trỏ.
// Hiệu suất duyệt mảng tốt hơn

public class Main {
  public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("name 1");
        names.add("name 2");
        names.add("name 3");

        ListIterator<String> iterator = names.listIterator();

        // di chuyển con trỏ đến phần tử thứ 2
        iterator.next();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);

            // từ phần tử thứ 2 sẽ được in hoa ký tự do con trỏ bắt đầu từ vị trí thứ 2
            iterator.set(name.toUpperCase());
        }

        System.out.println("Modified list:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
