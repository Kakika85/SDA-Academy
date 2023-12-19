import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        if (text.length() <= 3) {
            System.out.println(text.toUpperCase());
        } else {
            String lastThreeCharacters = text.substring(text.length() - 3);
            String restOfText = text.substring(0, text.length() - 3);
            String newText = restOfText + lastThreeCharacters.toUpperCase();
            System.out.println(newText);
        }
    }
}