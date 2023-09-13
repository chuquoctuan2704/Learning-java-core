package OOP.DemoClassObject;

// this is a class
class PersonalModel {
  String name;
  String age;

  PersonalModel(String name, String age) {
    this.name = name;
    this.age = age;
  }

  public String toString() {
    return "Name: " + name + ". Age: "+ age;
  }
}

