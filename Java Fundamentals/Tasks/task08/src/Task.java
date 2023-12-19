import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        int n;
        int sum = 0;
        do {
            n = number.nextInt();
            sum += n;
        } while (n != 0);

        System.out.println(sum);
    }

}
