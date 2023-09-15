package DateTime.LocalDateTime;

import java.time.LocalDate;

public class LocalDateDemo {
  public static void main(String[] args) {
    System.out.println("Khởi tạo LocalDate");
    LocalDate date1 = LocalDate.of(2023, 9, 13);
    System.out.println(date1.toString());
    LocalDate date2 = LocalDate.now();
    System.out.println(date2.toString());
    LocalDate date3 = LocalDate.parse("2023-09-16");
    System.out.println(date3.toString());

    System.out.println("----------------------------------");
    System.out.println("Truy xuất thành phần LocalDate");
    int day = date2.getDayOfMonth();
    System.out.println(day);
    int month = date2.getMonthValue();
    System.out.println(month);
    int year = date2.getYear();
    System.out.println(year);

    System.out.println("----------------------------------");
    System.out.println("So sánh LocalDate");
    boolean isSameDay = date1.isEqual(date2);
    System.out.println(isSameDay);
    boolean isBefore = date1.isBefore(date2);
    System.out.println(isBefore);
    boolean isAfter = date1.isAfter(date2);
    System.out.println(isAfter);

    System.out.println("----------------------------------");
    System.out.println("Thay đổi LocalDate");
    LocalDate tomorrow = date1.plusDays(1);
    System.out.println(tomorrow);
    LocalDate lastWeek = date1.minusWeeks(1);
    System.out.println(lastWeek);
    LocalDate newYear = date1.withYear(2024);
    System.out.println(newYear);
  }
}
