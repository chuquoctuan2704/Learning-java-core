package AccessModifier;

// public: truy cập mọi nơi
// protect: truy cập trong cùng gói hoặc lớp con ở trong và ngoài gói
// default: truy cập trong cùng gói, lớp con cùng gói
// private: chỉ có thể truy cập bên trong cùng lớp

public class DemoAccessModifier {
  public static void main(String[] args) {
    MethodRepository method = new MethodRepository();

    System.out.println(method.publicField);
    System.out.println(method.protectedField);
    System.out.println(method.defaultField);
    // cannot call private variable
    // System.out.println(method.privateField);

    method.publicMethod();
    method.protectedMethod();
    method.defaultMethod();
    method.callMethod();
    // cannot call private method
    // method.privateMethod();

    System.out.println("--------------------------------");

    ChildMethodRepository child = new ChildMethodRepository();

    child.methodPublicFromParent();
    child.methodProtectFromParent();
    child.methodDefaultFromParent();
  }
}
