package SpecialClass.UUIDClass;

import java.util.UUID;

public class Main {
  public static void main(String[] args) {
    // Tạo một UUID ngẫu nhiên
    UUID uuid = UUID.randomUUID();

    System.out.println("UUID ngẫu nhiên: " + uuid.toString());

    // Chuyển đổi từ chuỗi UUID thành UUID
    UUID parsedUUID = UUID.fromString(uuid.toString());
    System.out.println("Chuyển đổi từ chuỗi thành UUID: " + parsedUUID.toString());

    long mostSignificantBits = uuid.getMostSignificantBits();
    long leastSignificantBits = uuid.getLeastSignificantBits();

    System.out.println("Most Significant Bits: " + mostSignificantBits);
    System.out.println("Least Significant Bits: " + leastSignificantBits);
  }
}
