package DataStruct;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
  public static void main(String[] args) {
    // Mảng (Array): Mảng là một cấu trúc dữ liệu tập hợp các phần tử cùng kiểu dữ
    // liệu. Chúng cho phép bạn lưu trữ nhiều giá trị trong một biến duy nhất và
    // truy cập chúng bằng chỉ số.
    int[] arr = new int[3];
    arr[0] = 1;
    arr[1] = 3;
    for (int i : arr) {
      System.out.println(i);
    }

    // ArrayList: ArrayList là một danh sách động được cung cấp bởi thư viện Java.
    // Nó có thể mở rộng tự động khi cần và cho phép bạn thêm, xóa và truy cập phần
    // tử một cách dễ dàng.
    ArrayList<String> arrList = new ArrayList<>();
    arrList.add("A");
    arrList.add("B");
    for (String i : arrList) {
      System.out.println(i);
    }

    // LinkedList: LinkedList là một danh sách liên kết hai chiều. Nó cho phép bạn
    // thêm và xóa các phần tử một cách nhanh chóng, nhưng truy cập phần tử ở vị trí
    // bất kỳ có thể chậm hơn ArrayList.
    LinkedList<Integer> linkedList = new LinkedList<>();
    linkedList.add(1);
    linkedList.add(2);
    for (Integer i : linkedList) {
      System.out.println(i);
    }

    // HashMap: HashMap là một cấu trúc dữ liệu ánh xạ (key-value) cho phép bạn lưu
    // trữ các cặp key-value và truy cập chúng theo key. Nó cho phép tìm kiếm nhanh
    // chóng dựa trên key.
    HashMap<String, Integer> scores = new HashMap<>();
    scores.put("A", 90);
    scores.put("B", 85);
    System.out.println(scores.get("A"));
    System.out.println(scores.get("B"));

    // HashSet: HashSet là một tập hợp dựa trên bảng băm chứa các phần tử không
    // trùng lặp. Nó được sử dụng để lưu trữ tập hợp các giá trị duy nhất.
    HashSet<String> uniqueNames = new HashSet<>();
    uniqueNames.add("A");
    uniqueNames.add("B");
    for (String i : uniqueNames) {
      System.out.println(i);
    }

    // Queue và Stack: Java cung cấp các giao diện Queue và Stack để làm việc với
    // hàng đợi và ngăn xếp. Các lớp như LinkedList có thể được sử dụng để triển
    // khai các cấu trúc dữ liệu này.
    Queue<String> queue = new LinkedList<>();
    queue.offer("Aqueue");
    queue.offer("Bqueue");
    for (String i : queue) {
      System.out.println(i);
    }

    Stack<String> stack = new Stack<>();
    stack.push("Astack");
    stack.push("Bstack");
    for (String i : stack) {
      System.out.println(i);
    }

    // TreeMap và TreeSet: TreeMap và TreeSet là các cấu trúc dữ liệu dựa trên cây
    // dùng cho việc sắp xếp và lưu trữ các phần tử theo thứ tự tăng dần.
    TreeMap<String, Integer> sortedScores = new TreeMap<>();
    sortedScores.put("Alice", 90);
    sortedScores.put("Bob", 85);
    System.out.println(sortedScores.get("Alice"));
    System.out.println(sortedScores.get("Bob"));

    TreeSet<String> sortedNames = new TreeSet<>();
    sortedNames.add("Alice");
    sortedNames.add("Bob");
    for (String i : sortedNames) {
      System.out.println(i);
    }
  }
}
