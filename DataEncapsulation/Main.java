package DataEncapsulation;

public class Main {
  public static void main(String[] args) {
    ObjectDemo obj = new ObjectDemo("Tên", 27);

    System.out.println(obj.toString());

    obj.setName("Tên người thứ 2");
    obj.setAge(30);

    System.out.println(obj.toString());

    System.out.println("Lấy giá trị từng thông tin của đối tượng: ");
    System.out.println("Tên: " + obj.getName());
    System.out.println("Tuổi: " + obj.getAge());
  }
}
