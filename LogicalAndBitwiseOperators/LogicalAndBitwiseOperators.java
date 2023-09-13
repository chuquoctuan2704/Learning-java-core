package LogicalAndBitwiseOperators;

public class LogicalAndBitwiseOperators {
  public static void main(String[] args) {
    // Logical
    boolean a = true;
    boolean b = false;

    boolean and = a && b;
    System.out.println("and = " + and);

    boolean or = a || b;
    System.out.println("or = " + or);

    boolean not = !a;
    System.out.println("not = " + not);

    // Bitwise

    int c = 5; // 0000 0101
    int d = 3; // 0000 0011

    int andBit = c & d;
    System.out.println("andBit = " + andBit);

    int orBit = c | d;
    System.out.println("orBit = " + orBit);

    int xorBit = c ^ d;
    System.out.println("xorBit = " + xorBit);

    int notBit = ~c;
    System.out.println("notBit = " + notBit);
  }
}
