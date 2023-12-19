import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = Integer.parseInt(scanner.nextLine());
        boolean vyska = height > 150;

        float weight = Float.parseFloat(scanner.nextLine());
        boolean vaha = weight <= 180;

        if (vyska && vaha) {
            System.out.println("Fasten your seatbelt!");
        } else {
            System.out.println("I'm sorry you can't go!");
        }
    }
}