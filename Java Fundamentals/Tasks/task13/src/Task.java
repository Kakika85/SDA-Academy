import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        if (text.contains("Java")) {
            System.out.println("Found Java");
        }
        if (text.startsWith("Java")) {
            System.out.println("Starts with Java");
        }
        if (text.endsWith("Java")) {
            System.out.println("Ends with Java");
        }
        if (text.equals("Java")) {
            System.out.println("Equals Java");
        }
        System.out.println(text.indexOf("Java"));
    }
}