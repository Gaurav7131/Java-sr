import java.time.LocalDate;
import java.time.Period;

public class DateTimeEx {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate futureDate = today.plusDays(10);
        Period period = Period.between(today, futureDate);// Days Diff
        System.out.println("Days Differnce:" + period.getDays());// 10
    }
}
