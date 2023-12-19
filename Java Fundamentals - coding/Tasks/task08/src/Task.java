import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        if (x >= 0) {
            for (int i = x; i >= 0; i--) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = x; i <= 0; i++) {
                System.out.print(i + " ");
            }
        }
    }
}