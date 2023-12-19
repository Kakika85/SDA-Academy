import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if ((a > 0 && b > 0) || (a < 0 && b < 0)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
