import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;

        for (int x = a; x <= b; x++) {
            sum += x;
            //sum += a + x;
        }
        if (a < b) {
            System.out.println(sum);
        } else {
            System.out.println("Job completed");
        }
    }
}
