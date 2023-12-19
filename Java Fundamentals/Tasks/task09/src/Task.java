import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> poleZeScaneru = new ArrayList<>();

        int n;
        while (true) {
            n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            poleZeScaneru.add(n);
        }
        Collections.sort(poleZeScaneru);
        int min = poleZeScaneru.get(0);
        int max = poleZeScaneru.get(poleZeScaneru.size() - 1);

        int sum = min + max;
        double average = sum / 2.0;

        System.out.println(sum + "\n" + average);
    }
}
