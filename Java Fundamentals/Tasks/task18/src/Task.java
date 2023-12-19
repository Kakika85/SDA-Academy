import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] text = scanner.nextLine().toCharArray();
        int n = scanner.nextInt();
        char[] cipheredText = new char[text.length];

        for (int i = 0; i < text.length; i++) {
            if (text[i] == ' ') {
                cipheredText[i] = text[i];
                continue;
            }

            int charCode = ((int) text[i] + n) - 96;
            charCode = charCode % 26 + 96;

            cipheredText[i] = (char) charCode;
        }

        System.out.println(new String(cipheredText));
    }
}