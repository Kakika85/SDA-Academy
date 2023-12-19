import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner napisStupne = new Scanner(System.in);
       // System.out.println("Napište teplotu ve stupních Celsia:");

        double farhenheit;
        double celsius = napisStupne.nextDouble();

        farhenheit = (1.8 * celsius) + 32.0;
        System.out.println(farhenheit);
    }
}