package DataStruct.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
  public static void main(String[] args) {
    // Tạo một bộ so sánh tùy chỉnh để sắp xếp giảm dần
    Comparator<Integer> descendingOrder = new Comparator<Integer>() {
      @Override
      public int compare(Integer num1, Integer num2) {
        // Đảo ngược thứ tự tự nhiên để sắp xếp giảm dần
        return num2.compareTo(num1);
      }
    };

    // Tạo một TreeSet sắp xếp tự nhiên (tăng dần)
    TreeSet<Integer> treeSet = new TreeSet<>(descendingOrder);

    // Thêm phần tử vào TreeSet
    treeSet.add(5);
    treeSet.add(2);
    treeSet.add(8);

    // Duyệt qua các phần tử trong TreeSet (theo thứ tự tăng dần)
    for (Integer number : treeSet) {
      System.out.println(number);
    }
  }
}
