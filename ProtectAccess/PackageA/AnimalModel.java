package ProtectAccess.PackageA;

public class AnimalModel {
  protected String name;

  protected AnimalModel(String name) {
    this.name = name;
  }

  protected void info() {
    System.out.println("Animal: " + name);
  }
}
