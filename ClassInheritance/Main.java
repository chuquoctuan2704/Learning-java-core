package ClassInheritance;

public class Main {
  public static void main(String[] args) {
    
    DogModel dog = new DogModel("Chó", "03");
    CatModel cat = new CatModel("Mèo", "02");

    dog.info();
    cat.info();
  }
}