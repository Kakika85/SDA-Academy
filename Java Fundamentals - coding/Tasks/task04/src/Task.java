import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amoutOfJam = scanner.nextInt();

        int amountOf7kgJars = amoutOfJam / 7;

        int amountOf1kgJars = amoutOfJam % 7;

        System.out.println(amountOf1kgJars + amountOf7kgJars <= 6);
    }
}