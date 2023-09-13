package AccessModifier;

public class MethodRepository {

  public int publicField = 1;
  protected int protectedField = 2;
  int defaultField = 3;
  private int privateField = 4;

  public void publicMethod() {
    System.out.println("public method");
  }

  protected void protectedMethod() {
    System.out.println("protected method");
  }

  void defaultMethod() {
    System.out.println("default method");
  }

  private void privateMethod() {
    System.out.println("private method: " + privateField);
  }

  void callMethod() {
    privateMethod();
  }
}
