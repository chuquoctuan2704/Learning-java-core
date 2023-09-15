package DateTime.LocalDateTime;

import java.time.LocalTime;

public class LocalTimeDemo {
  public static void main(String[] args) {
    System.out.println("Khởi tạo LocalTime");
    LocalTime time1 = LocalTime.of(14, 30);
    System.out.println(time1);
    LocalTime time2 = LocalTime.now();
    System.out.println(time2);
    LocalTime time3 = LocalTime.parse("14:30:00");
    System.out.println(time3);

    System.out.println("----------------------------------");
    System.out.println("Truy xuất thành phần LocalTime");
    int hour = time2.getHour();
    System.out.println(hour);
    int minute = time2.getMinute();
    System.out.println(minute);
    int second = time2.getSecond();
    System.out.println(second);
    int nano = time2.getNano();
    System.out.println(nano);

    System.out.println("----------------------------------");
    System.out.println("So sánh LocalTime");
    boolean isSameTime = time1.equals(time2);
    System.out.println(isSameTime);
    boolean isBefore = time1.isBefore(time2);
    System.out.println(isBefore);
    boolean isAfter = time1.isAfter(time2);
    System.out.println(isAfter);

    System.out.println("----------------------------------");
    System.out.println("Thay đổi LocalDate");
    LocalTime laterTime = time2.plusHours(1);
    System.out.println(laterTime);
    LocalTime earlierTime = time2.minusMinutes(15);
    System.out.println(earlierTime);
    LocalTime newHour = time2.withHour(12);
    System.out.println(newHour);
  }
}
