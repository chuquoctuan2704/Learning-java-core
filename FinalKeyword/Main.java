package FinalKeyword;

public class Main {
  public static void main(String[] args) {
    
    // Biến final được gán giá trị 1 lần duy nhất, và giá trị phải được khởi tạo khi khai báo biến
    final String def = "default";
    // def = "";
    System.out.println(def);

    FinalClass finalClass = new FinalClass();
    finalClass.info();
  }
}
