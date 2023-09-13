package AccessModifier;

public class ChildMethodRepository extends MethodRepository{
  public void methodPublicFromParent() {
    publicMethod();
  }

  public void methodProtectFromParent() {
    protectedMethod();
  }

  public void methodDefaultFromParent() {
    defaultMethod();
  }
}
