import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arr[][] = new int[2][5];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 5; i++) {
            int numberToFind = arr[0][i];
            for (int j = 0; j < 5; j++) {
                if (arr[1][j] == numberToFind) {
                    System.out.println(numberToFind);
                    break;
                }
            }
        }
    }
}