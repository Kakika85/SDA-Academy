import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        //scaner
        //všechna lichá čísla max do výše vloženého čísla a odřádkované

        Scanner number1 = new Scanner(System.in);
        int number = number1.nextInt();

        for (int i = 1; i <= number; i = i + 2) {

            System.out.println(i);
        }
    }
}