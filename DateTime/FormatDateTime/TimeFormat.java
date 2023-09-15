package DateTime.FormatDateTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeFormat {
  public static void main(String[] args) {
    String input = "14:30:01";
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    LocalTime parsedDateTime = LocalTime.parse(input, formatter);
    System.out.println("Giờ đã phân tích: " + parsedDateTime);
  }
}
