import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String[] words = text.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
        Map<String, Integer> wordsOccurrences = new TreeMap<>();

        for (String word : words) {
            Integer count = wordsOccurrences.get(word);
            if (count != null) {
                count++;
            } else {
                count = 1;
            }

            wordsOccurrences.put(word, count);
        }

        wordsOccurrences.forEach((key, val) -> System.out.println(key + " - " + val));
    }
}