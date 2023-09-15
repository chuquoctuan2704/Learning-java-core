package DateTime.DifferenceCalculation;

import java.time.LocalDate;
import java.time.Period;

public class DateDifferenceCalculation {
  public static void main(String[] args) {
    LocalDate startDate = LocalDate.of(2023, 9, 1);
    LocalDate endDate = LocalDate.of(2023, 9, 13);

    Period period = Period.between(startDate, endDate);

    int years = period.getYears();
    int months = period.getMonths();
    int days = period.getDays();

    System.out.println("Khoảng cách: " + years + " năm " + months + " tháng " + days + " ngày");
  }
}
