package ukoly;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Sportka {
    public static void main(String[] args) {
        //napiste program ktery vygeneruje nahodna cisla z 1-49 (ulozte do pole) celkem 5 kousku
        //nechte uzivatele vsadit 5 cisel a vypiste mu poradi vyhry/prohra

        //int x = 4;
        // 1. vsechny
        //2. 4
        //3. 3
        //4. 2

        //zkuste simulovat sazky, v cyklu budete generovat sazky (vygenerujete 5 cisel za uzivatele) a
        //zkontrolujete jestli dosahl x-teho poradi, vypiste pocet pokusu ktere byli potreba pro dosazeni x-te vyhry

        Random losovani = new Random();
        Random ticket = new Random();
        Scanner mojeCisla = new Scanner(System.in);
        //todo samozrejme je to idealni ale neprocvicis se v cyklech polich,....
        //to je jako bych chtel napiste program ktery setridi pole pomoci nejakeho tridiciho algoritmu
        //a ty pouzijes Arrays.sort(
        //:)
        Set<Integer> losovanaCisla = new HashSet<>();
        Set<Integer> ticketovaCisla = new HashSet<>();



        System.out.println("Čisla tahu jsou:");

        for (int i = 0; i < 5; i++) {
            //typicky priklad na do/while
            //neni to peknejsi?
//            do {
//                if( losovanaCisla.add(losovani.nextInt(1, 6))){
//                    break;
//                }
//            } while (true);

            int losovaneCislo = losovani.nextInt(1, 6);
            boolean byloUlozeno = losovanaCisla.add(losovaneCislo);
            while (!byloUlozeno) {
                losovaneCislo = losovani.nextInt(1, 6);
                byloUlozeno = losovanaCisla.add(losovaneCislo);
            }

            System.out.println(losovaneCislo);
        }

        /*  POKUD BY TO BYL NÁHODNÝ TICKET
        System.out.println("Váš ticket má čísla:");

        for (int i = 0; i < 5; i++) {
            int ticketCislo = ticket.nextInt(1, 50);
            boolean byloUlozeno = ticketovaCisla.add(ticketCislo);
            while (!byloUlozeno){
                ticketCislo = ticket.nextInt(1,6);
                byloUlozeno =  ticketovaCisla.add(ticketCislo);
            }
            System.out.println(ticketCislo);
        }
        */
        /* SLOŽITĚJSÍ VARIANTA - REFAKTOROVÁNO NÍŽE
        System.out.println("Zadej první číslo svého losu");
        int a = Integer.parseInt(mojeCisla.nextLine());
        while (!(a > 0 && a < 51)) {
            System.out.println("Špatně zadané první číslo, prosím zkonrolujte a zadejte znovu");

            boolean byloVypsáno = ticketovaCisla.add(a);
            a = Integer.parseInt(mojeCisla.nextLine());
        }

        System.out.println("Zadej druhé číslo svého losu");
        int b = Integer.parseInt(mojeCisla.nextLine());
        while (!(b > 0 && b < 51)) {
            System.out.println("Špatně zadané druhé číslo, prosím zkonrolujte a zadejte znovu");

            boolean byloVypsáno = ticketovaCisla.add(b);
            b = Integer.parseInt(mojeCisla.nextLine());
        }

        System.out.println("Zadej třetí číslo svého losu");
        int c = Integer.parseInt(mojeCisla.nextLine());
        while (!(c > 0 && c < 51)) {
            System.out.println("Špatně zadané třetí číslo, prosím zkonrolujte a zadejte znovu");

            boolean byloVypsáno = ticketovaCisla.add(c);
            c = Integer.parseInt(mojeCisla.nextLine());
        }

        System.out.println("Zadej čtvrté číslo svého losu");
        int d = Integer.parseInt(mojeCisla.nextLine());
        while (!(d > 0 && d < 51)) {
            System.out.println("Špatně zadané čtvrté číslo, prosím zkonrolujte a zadejte znovu");

            boolean byloVypsáno = ticketovaCisla.add(d);
            d = Integer.parseInt(mojeCisla.nextLine());
        }

        System.out.println("Zadej páté číslo svého losu");
        int e = Integer.parseInt(mojeCisla.nextLine());
        while (!(e > 0 && e < 51)) {
            System.out.println("Špatně zadané páté číslo, prosím zkonrolujte a zadejte znovu");

            boolean byloVypsáno = ticketovaCisla.add(e);
            e = Integer.parseInt(mojeCisla.nextLine());
        }

        System.out.println("Vysledek je:" + (a + ", " + b + ", " + c + ", " + d + ", " + e));
    */

        System.out.println("Zadej číslo svého losu");

        for (int i = 0; i < 5; i++) {
            int a;
            do {
                a = Integer.parseInt(mojeCisla.nextLine());
                if(!(a > 0 && a < 51)){
                    System.out.println("Špatně zadané číslo, prosím zkonrolujte a zadejte znovu");
                }
                if (ticketovaCisla.contains(a)){
                    System.out.println("Čislo jste již zadal, prosím zkontrolujte");
                }
            } while (!(a > 0 && a < 51) || ticketovaCisla.contains(a));
            ticketovaCisla.add(a);
        }

        // SROVNÁVAČ ČÍSEL
        int pocetCisel = 0;
        for (Integer ticketoveCislo : ticketovaCisla){
            if (losovanaCisla.contains(ticketoveCislo)){
                pocetCisel++;
            }
        }


        // VÝSLEDKOVÁ LISTINA A VÝHERNÍ VERDIKT
        System.out.print("Počet uhodnutých čísel je: " + pocetCisel);

        switch (pocetCisel) {
            case 5:
                System.out.println(", to je první výhra!");
                break;
            case 3,4:
                System.out.println(", to je druhá výhra!");
                break;
            case 1,2:
                System.out.println(", to je třetí výhra!");
                break;
            case 0:
                System.out.println(", to není žádná výhra, zkuste štěstí příště!");
                default:
                }
        }
}

// zítra udělat srovnání a nějaké výherní příčky

