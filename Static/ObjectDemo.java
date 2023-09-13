package Static;

public class ObjectDemo {

  public static String staticVariable = "Default";

  public static int sum(int a, int b) {
    return a + b;
  }

  public static class Child {
    String field1;
    String field2;

    Child(String field1, String field2) {
      this.field1 = field1;
      this.field2 = field2;
    }

    public String toString() {
      return "Field1: " + field1 + ". Field2: " + field2;
    }
  }
}
