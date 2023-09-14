package SuperClassConstructor;

public class CatModel extends AnimalModel {
  int age;

  CatModel(String name, int age) {
    super(name);
    this.age = age;
    System.out.println("Contructor cat initial");
  }

  void catInfo() {
    System.out.println(name + " - " + age);
    super.info();
  }
}
