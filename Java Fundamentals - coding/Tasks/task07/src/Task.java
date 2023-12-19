import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (x > y || x < 0 || y > 10_000) {
            return;
        }

        int firstNumberDivisibleBySeven;
        if (x % 7 == 0) {
            firstNumberDivisibleBySeven = x;
        } else {
            firstNumberDivisibleBySeven = x + (7 - x % 7);
        }

        for (int i = firstNumberDivisibleBySeven; i <= y; i += 7) {
            System.out.println(i);
        }

        if (x > y || x < 0 || y > 10_000) {
            return;
        }
        for (int i = x; i <= y; i++) {
            if (i % 7 == 0) {
//                System.out.println(i);
            }
        }
    }
}