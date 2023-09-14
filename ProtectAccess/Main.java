package ProtectAccess;

import ProtectAccess.PackageA.AnimalA;
import ProtectAccess.PackageB.AnimalB;

// Protect cho phép truy cập từ các lớp cùng gói và các lớp con của nó trong và ngoài gói.

public class Main {
  public static void main(String[] args) {
    AnimalA a = new AnimalA("AnimalA");
    AnimalB b = new AnimalB("AnimalB");

    a.info();
    b.info();
  }
}
