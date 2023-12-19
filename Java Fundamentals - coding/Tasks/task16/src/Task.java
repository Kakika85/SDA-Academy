import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        long factorial = n;
        while (--n > 0) {
            factorial *= n;
        }

        System.out.println(factorial);
    }
}