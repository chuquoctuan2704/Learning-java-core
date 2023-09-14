package SuperClassConstructor;

// SuperClass là lớp cha chứa các thuộc tính và phương thước được các lớp con kế thừa và triển khai

// Từ khóa super dùng để truy cập vào các thuộc tính và phương thức của super class

public class Main {
  public static void main(String[] args) {

    CatModel cat = new CatModel("Mèo", 10);
    // cat.info();
    cat.catInfo();
  }
}
