import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task {
    public static void main(String[] args) {
        // you can call the method here for testing
    }

    public static LocalDate toLocalDate(String pattern, String input) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
        return LocalDate.parse(input, dateTimeFormatter);

    }
}