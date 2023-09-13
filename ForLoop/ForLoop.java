package ForLoop;

public class ForLoop {
  public static void main(String[] args) {
    for(int i = 0; i < 10; i++) {
      System.out.println("value: " + i);
    }

    int[] arr = {10, 5, 3, 6, 7};
    for (int i = 0; i < arr.length; i++) {
      System.out.println("item " + i + " in array: " + arr[i]);
    }
  }
}
