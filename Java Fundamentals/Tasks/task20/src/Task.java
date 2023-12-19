import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Task {
    public static void main(String[] args) {
        // you can call the method here for testing
    }

    public static int[] calculateDifference(String dateA, String dateB) {
        DateTimeFormatter dateTimeFormatterA = DateTimeFormatter.ofPattern("yyyy::MM::dd");
        DateTimeFormatter dateTimeFormatterB = DateTimeFormatter.ofPattern("MM--yyyy-d");
        LocalDate localDateA = LocalDate.parse(dateA, dateTimeFormatterA);
        LocalDate localDateB = LocalDate.parse(dateB, dateTimeFormatterB);

        Period period = Period.between(localDateA, localDateB);

        return new int[]{period.getYears(), period.getMonths(), period.getDays()};
    }
}