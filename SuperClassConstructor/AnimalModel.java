package SuperClassConstructor;

public class AnimalModel {
  String name;

  AnimalModel(String name) {
    this.name = name;
    System.out.println("Constructor Animal initial");
  }

  void info() {
    System.out.println("Animal: " + name);
  }
}
