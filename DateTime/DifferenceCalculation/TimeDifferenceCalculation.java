package DateTime.DifferenceCalculation;
import java.time.Duration;
import java.time.LocalTime;

public class TimeDifferenceCalculation {
  public static void main(String[] args) {
    LocalTime startTime = LocalTime.of(10, 0);
    LocalTime endTime = LocalTime.of(12, 30);

    Duration duration = Duration.between(startTime, endTime);

    long hours = duration.toHours();
    long minutes = duration.toMinutes() % 60;

    System.out.println("Khoảng thời gian: " + hours + " giờ " + minutes + " phút");
  }
}
