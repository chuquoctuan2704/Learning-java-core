package ClassInheritance;

public class DogModel extends AnimalModel {

  DogModel(String name, String age) {
    super(name, age);
  }

  void info() {
    System.out.println("Dog: " + name + " - " + age);
  }
  
}
