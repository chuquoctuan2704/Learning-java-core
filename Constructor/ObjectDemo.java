package Constructor;

public class ObjectDemo {
  String field1;
  String field2;
  String field3;

  // Constructor không tham số
  ObjectDemo() {
  }

  // Constructor có tham số
  ObjectDemo(String field1) {
    this.field1 = field1;
  }

  ObjectDemo(String field1, String field2) {
    this.field1 = field1;
    this.field2 = field2;
  }

  public String toString() {
    return "Field1: " + field1 + ". Field2: " + field2 + ". Field3: " + field3;
  }
}
