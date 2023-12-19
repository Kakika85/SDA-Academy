import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] text = scanner.nextLine().toCharArray();

        int parenthesesOpen = 0;

        for (char c : text) {
            switch (c) {
                case '(':
                    parenthesesOpen++;
                    break;
                case ')':
                    parenthesesOpen--;
                    break;
            }

            if (parenthesesOpen < 0) {
                break;
            }
        }

        if (parenthesesOpen != 0) {
            System.out.println("Incorrect pairing of brackets");
        } else {
            System.out.println("OK");
        }

    }
}