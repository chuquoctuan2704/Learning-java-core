package NestedForLoop;

public class NestedForLoop {
  public static void main(String[] args) {
    int num = 10;

    for (int i = 0; i <= num; i++) {

      String line = "";
      
      // Khoảng trống đầu hình tam giác bằng tổng - giá trị i
      for(int z = num-i; z > 0; z--) {
        line += " ";
      }

      // Sao sẽ phải nhỏ hơn i, nhân 2 để thành tam giác cân, -1 để giảm các dòng mới có góc nhọn đầu tiên
      for (int j = 0; j < i * 2 - 1; j++) {
        line += "*";
      }
      System.out.println(line);
    }
  }
}
