import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int i = 0;
        while (true) {
            int j = (int) Math.pow(2, i++);
            if (j > n) {
                break;
            }
            System.out.println(j);
        }
    }
}