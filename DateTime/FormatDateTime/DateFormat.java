package DateTime.FormatDateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormat {
  public static void main(String[] args) {
    LocalDate date = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd, yyyy");

    String formattedDate = date.format(formatter);
    System.out.println("Ngày đã định dạng: " + formattedDate);
  }
}
