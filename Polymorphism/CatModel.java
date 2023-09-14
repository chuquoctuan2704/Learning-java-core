package Polymorphism;

public class CatModel extends AnimalModel {

  @Override
  void info() {
    System.out.println("Overriding");
  }

  void info(String a) {
    System.out.println("Overrloading");
  }
}
