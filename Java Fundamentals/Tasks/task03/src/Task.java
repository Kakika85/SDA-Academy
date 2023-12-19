import java.util.Scanner;

public class Task {
    public static void main(String[] args) {


        //18% 0 < 85,528 - 556,02
        //32% mzda > 85,528
        //výpočet bude: mzda   - 85,528 ----- 32%
        //              základ - 85,528 ----- 18%

        Scanner sc = new Scanner(System.in);
        double mzda = sc.nextDouble();

        double dan = 0.0;

        if (mzda < 85528) {
            dan = mzda * 0.18 - 556.02;

        } else {
            dan = ((mzda - 85528) * 0.32) + (85528 * 0.18 - 556.02);
        }
        if(dan < 0) { dan = 0; }

        /*double hraniceBezDane = 556.02;
        double hraniceNaVelkou = 85528;
        double danMala = 0.18;
        double danVelka = 0.32;

        dan = Math.max(0, Math.min(mzda, hraniceNaVelkou) * danMala - hraniceBezDane + Math.max(0, mzda - hraniceNaVelkou) * danVelka);
         */

        System.out.println(dan);
    }
}