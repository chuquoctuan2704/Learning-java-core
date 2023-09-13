package Constructor;

public class Main {
  public static void main(String[] args) {
    ObjectDemo obj1 = new ObjectDemo();
    ObjectDemo obj2 = new ObjectDemo("thông tin 1");
    ObjectDemo obj3 = new ObjectDemo("thông tin 1", "thông tin 2");

    System.out.println(obj1.toString());
    System.out.println(obj2.toString());
    System.out.println(obj3.toString());
  }
}
