package DataEncapsulation;

public class ObjectDemo {
  private String name;
  private int age;

  ObjectDemo(String name, int age) {
    this.name = name;
    this.age = age;
  }

  void setName(String name) {
    this.name = name;
  }

  void setAge(int age) {
    this.age = age;
  }

  String getName() {
    return name;
  }

  int getAge() {
    return age;
  }

  public String toString() {
    return "Name: " + name + ". Age: " + age;
  }
}
