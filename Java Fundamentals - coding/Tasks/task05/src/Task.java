import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float f = scanner.nextFloat();

        System.out.println(Math.floor(f));
        System.out.println(Math.round(f));
        System.out.println(Math.ceil(f));
    }
}