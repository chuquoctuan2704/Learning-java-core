package MethodOverriding;

public class Main {
  public static void main(String[] args) {

    AnimalModel animalModel = new AnimalModel();
    AnimalModel animalToCat = new CatModel();
    CatModel cat = new CatModel();

    animalModel.info();
    animalToCat.info();
    cat.info();
  }
}