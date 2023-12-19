import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        int[] numbers = Arrays
            .stream(args)
            .mapToInt(Integer::parseInt)
            .toArray();

        int[] occurrences = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            occurrences[numbers[i] - 1] += 1;
        }

        for (int j = 0; j < occurrences.length; j++) {
            System.out.println(j + 1 + " - " + occurrences[j]);
        }
    }
}