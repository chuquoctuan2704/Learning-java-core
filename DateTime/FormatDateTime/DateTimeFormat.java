package DateTime.FormatDateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormat {
  public static void main(String[] args) {
    LocalDateTime dateTime = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    String formattedDateTime = dateTime.format(formatter);
    System.out.println("Ngày và giờ đã định dạng: " + formattedDateTime);

    String input = "13/09/2023 14:30:00";
    DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    LocalDateTime parsedDateTime = LocalDateTime.parse(input, formatter2);
    System.out.println("Ngày và giờ đã phân tích: " + parsedDateTime);
  }
}
