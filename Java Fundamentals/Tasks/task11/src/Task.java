import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number <= 1) {
            System.out.println("I am interrupting work");
            return;
        }

        boolean isPrimeNumber = true;

        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                isPrimeNumber = false;
                break;
            }
        }

        if (isPrimeNumber) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
