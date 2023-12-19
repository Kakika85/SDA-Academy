import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        text = text.replaceAll(" ", "");    // removes spaces
        text = text.toLowerCase();     // palindromes are case insensitive

        boolean palindrome = true;
        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                palindrome = false;
                break;
            }
        }
        System.out.println(palindrome);
    }
}