import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String reversed = new StringBuilder(text).reverse().toString();

        System.out.println(reversed);
    }
}