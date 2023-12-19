package ukoly;

import java.util.Objects;
import java.util.Scanner;

public class NightChallenge_2 {
    public static void main(String[] args) {
        /**
         * Napište program v Javě, který simuluje jednoduchou registraci uživatelů do systému. Program by měl:
         * Zeptat se uživatele na jméno a věk.
         * Zkontrolovat, zda uživatel zadal správné věk (věk musí být v rozmezí 18 až 100 let).
         * Zeptat se uživatele na otázku, zda chce byt clenem klubu (ano/ne).
         * Na základě odpovědi na otázku o členství klubu a věku uživatele vytvořit podmínku pro registraci:
         * Pokud je uživatel starší než 18 let a chce byt clenem klubu, vypsat zprávu “Registrace úspěšná, vítejte v klubu!”
         * Pokud uživatel splňuje věk, ale nechce byt clenem klubu, vypsat zprávu “Registrace úspěšná, ale nejste členem klubu.”
         * Pokud uživatel neodpoví na otázku o členství klubu “ano” nebo “ne”, vypsat zprávu “Registrace neúspěšná,
         * nezadali jste odpověď na otázku o členství klubu.”
         * Pokud uživatel není starší 18 let, vypsat zprávu “Registrace neúspěšná, nejste dostačujícího věku.”
         * Nakonec vypsat “hello message”  se jménem uživatele.
         */

        Scanner klub = new Scanner(System.in);
        System.out.println("Zadej své jméno");
        String jmeno = klub.nextLine();

        System.out.println("Zadej věk");
        int a = Integer.parseInt(klub.nextLine());

        System.out.println("Chcete se stát členem klubu?");
        String chceBytClen = klub.nextLine();


        if (Objects.equals(chceBytClen, "ano")) { // varianta jedna - tady je automaticky ošetřena i hodnota null
            if (a >= 18 && a <= 100) {
                System.out.println("Registrace úspěšná, vítejte v klubu!");
                System.out.println("Pod jménem " + jmeno);
            }
        }

        if (chceBytClen != null && chceBytClen.equals("ne")) { // varianta dvě - tady hodnotu null musím ošetřit sama
            if (a >= 18 && a <= 100) {
                System.out.println("Registrace úspěšná, ale nejste členem klubu.");
                System.out.println("Pod jménem " + jmeno);
            }
        }

        if (!chceBytClen.equals("ano") && !chceBytClen.equals("ne")) {
            System.out.println("Registrace neúspěšná, nezadali jste odpověď na otázku o členství klubu.");
        }

        if (a < 18) {
            System.out.println("Registrace neúspěšná, nejste dostačujícího věku.");
        }

    }
}
