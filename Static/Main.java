package Static;

public class Main {
  public static void main(String[] args) {

    System.out.println(ObjectDemo.staticVariable);

    System.out.println(ObjectDemo.sum(1, 5));

    ObjectDemo.Child child = new ObjectDemo.Child("name", "abc");

    System.out.println(child.toString());
  }
}
