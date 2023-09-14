package Polymorphism;

// Nạp chồng (Overloading): Đây là khả năng cho phép một lớp có nhiều thuộc tính, 
// phương thức cùng tên nhưng với các tham số khác nhau về loại cũng như về số lượng. 
// Khi được gọi, dựa vào tham số truyền vào, phương thức tương ứng sẽ được thực hiện.

// Ghi đè (Overriding): là hai phương thức cùng tên, cùng tham số, cùng kiểu trả về nhưng thằng con viết lại và dùng theo cách của nó, 
// và xuất hiện ở lớp cha và tiếp tục xuất hiện ở lớp con. Khi dùng override, lúc thực thi, 
// nếu lớp Con không có phương thức riêng, phương thức của lớp Cha sẽ được gọi, ngược lại nếu có, phương thức của lớp Con được gọi.

public class Main {
  public static void main(String[] args) {

    AnimalModel animalModel = new CatModel();
    CatModel cat = new CatModel();

    animalModel.info();
    cat.info();
    cat.info(null);
  }
}
