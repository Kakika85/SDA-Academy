package ukoly;

import java.util.Scanner;

public class NightChallenge_1 {
    public static void main(String[] args) {
        /**
         * Napište program, který umožní uživateli zadat hodnocení studenta v rozsahu od 0 do 100 a
         * poté program vypíše odpovídající známku na základě těchto pravidel:
         * 90-100 bodů: A
         * 80-89 bodů: B
         * 70-79 bodů: C
         * 60-69 bodů: D
         * Méně než 60 bodů: F (nedostatečná)
         * Program by měl provádět následující kroky:
         * Vyzve uživatele k zadání bodového hodnocení studenta.
         * Na základě zadaných bodů použije podmínky k určení odpovídající známky.
         * Vypíše známku.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadej hodnocení (0-100)");


        int a = Integer.parseInt(scanner.nextLine());
        if (a >= 90 && a <= 100) {
            System.out.println("Výsledná známka je A");
        } else if (a >= 80 && a <= 89) {
            System.out.println("Výsledná známka je B");
        } else if (a >= 70 && a <= 79) {
            System.out.println("Výsledná známka je C");
        } else if (a >= 60 && a <= 69) {
            System.out.println("Výsledná známka je D");
        } else if (a < 60) {
            System.out.println("Výsledná známka je F (nedostatečná)");
        } else {
            System.out.println("Hodnota není přípustná");
            return;
        }
    }
}
