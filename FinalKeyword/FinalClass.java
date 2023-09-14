package FinalKeyword;

// Final class không cho các lớp khác kế thừa
final class FinalClass {

  // Phương thức final không thể override ở lớp con. (đối với class không phải final)
  final void info() {
    System.out.println("This is final method called");
  }
}
