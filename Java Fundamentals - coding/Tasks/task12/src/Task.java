import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String bleepText = "[bleep]";
        text = text
            .replaceAll("cheese and rice", bleepText)
            .replaceAll("chuck it", bleepText)
            .replaceAll("motherpuffin", bleepText);

        System.out.println(text);
    }
}