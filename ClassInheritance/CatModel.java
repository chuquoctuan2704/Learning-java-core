package ClassInheritance;

public class CatModel extends AnimalModel {

  CatModel(String name, String age) {
    super(name, age);
  }

  void info() {
    System.out.println("Cat: " + name + " - " + age);
  }
  
}
