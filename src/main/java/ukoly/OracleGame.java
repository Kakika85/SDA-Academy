package ukoly;

import java.util.Random;
import java.util.Scanner;

public class OracleGame {
    public static void main(String[] args) {
        Scanner hadanePismeno = new Scanner(System.in);
        Random r = new Random();

        String[] randomWords = {
            "jabko", "kolo", "krabice", "pes", "kava", "knihovna", "stul",
            "hory", "ryba", "kniha", "kvetina", "slunce", "hory", "caj",
            "malba", "housle", "voda", "strom", "pivo", "trava", "duha",
            "dum", "auto", "kvet", "nozky", "kapesnik", "kočka", "kolo", "hodinky",
            "sklenice", "kapesnik", "les", "rychlik", "kabelka", "hrad", "kamen", "skala", "papir", "plamen", "ulice",
            "okno", "most", "dvere", "brana", "lavice", "obraz", "skica", "hudba", "tvar", "planeta",
            "hradba", "deka", "vozidlo", "tajemstvi", "vitr", "bota", "lano", "klic", "radost", "cesta"
        };

        String tajneSlovo = randomWords[r.nextInt(randomWords.length)];
        int delka = tajneSlovo.length();

        String uhadnutaPismena = "";
        for (int i = 0; i < delka; i++) {
            uhadnutaPismena = uhadnutaPismena + "_";
        }
        do {
            System.out.println();
            System.out.println("tajne slovo: " + uhadnutaPismena);
            //System.out.println(tajneSlovo);   // testovací pomocný println
            System.out.println("Napiš písmeno, které si myslíš, že je v tajném slově");
            String pismeno = hadanePismeno.nextLine();

            if (pismeno.length() != 1) {
                System.out.println("zadej pouze jedno písmeno");
                continue;
            }

            if (tajneSlovo.contains(pismeno)) {

                // testoval jsem treba "skala"
                for (int i = tajneSlovo.indexOf(pismeno); i < tajneSlovo.length(); i = tajneSlovo.indexOf(pismeno, i+1)) {
                    if (i >= 0) {
                        //ale ty najdes jenom jedno, ok taky pristup
                        //ale kdyz ho zadam podruhe, porad najdes to prvni
                        StringBuilder sb = new StringBuilder(uhadnutaPismena);
                        sb.setCharAt(i, pismeno.charAt(0));
                        uhadnutaPismena = sb.toString();
                    }else{
                        break;
                    }
                }
                System.out.println("Slovo písmeno obsahuje");
            } else {
                System.out.println("Slovo písmeno neobsahuje");
            }

        } while (uhadnutaPismena.contains("_"));
        System.out.println("BRAVO!!! Slovo, které jsi uhádl je: " + uhadnutaPismena);
    }
}

        /*
        Zadání úkolu: Hra "Hádej slovo" v Javě
        Vaším úkolem je vytvořit jednoduchou textovou hru v jazyce Java s názvem "Hra Hádej slovo". Hra generuje tajné
        slovo a hráč se snaží uhodnout toto slovo písmeno po písmenu. Hra bude pokračovat, dokud hráč neuhodne celé slovo.

        Základní požadavky:

        Vytvořte program v jazyce Java pro hru "Hádej slovo".

        Program vybere nahodne tajne slovo z pole randomWords, které hráč bude muset uhodnout písmeno po písmenu.

        Hra bude zobrazovat aktuální stav uhodnutých písmen (např. "_ _ _ _ _") a hráč bude zadávat písmena.

        Pokud hráč uhodne písmeno, program ho upozorní, že písmeno bylo uhodnuto. Pokud ne, program ho upozorní,
        že takové písmeno ve slově není.

        Hra bude pokračovat, dokud hráč neuhodne celé tajné slovo.
         */

