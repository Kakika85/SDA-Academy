import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dateText = scanner.nextLine();
        java.time.LocalDate date = java.time.LocalDate.parse(dateText);

        java.time.LocalDate nextFriday = date;
        while (nextFriday.getDayOfWeek() != java.time.DayOfWeek.FRIDAY) {
            nextFriday = nextFriday.plusDays(1);
        }

        System.out.println(nextFriday);
    }
}