package DataStruct.ArrayObject;

public class ObjectModel {
  String name;

  ObjectModel(String name) {
    this.name = name;
  }

  void setName(String name) {
    this.name = name;
  }

  public String toString() {
    return "Tên là: " + name;
  }
}
