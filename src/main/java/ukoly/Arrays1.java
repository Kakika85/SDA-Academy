package ukoly;

import java.text.DecimalFormat;
import java.util.Random;

public class Arrays1 {
    public static void main(String[] args) {
        //generate array of int of n length with random value from 2,20 and print it in
        //this format {n1,n2,n3}
        Random r = new Random();
        DecimalFormat df = new DecimalFormat("#.##");
        int n = 30;
        int[] a = new int[n];
        int sucet = 0;

        System.out.print("{");
        for (int i = 0; i < n; i++) {
            a[i] = r.nextInt(2, 20);
        }
        for (int j = 0; j < a.length - 1; j++) {

            System.out.print(a[j] + ",");
        }
        System.out.print(a[a.length - 1]);
        System.out.print("}");

        for (int k = 0; k < n; k++) {
            sucet = sucet + a[k];
        }
        //double priemer=(double) sucet/n;
        //double zaokruhlenyPriemer = Double.parseDouble();
       // System.out.println("priemer hodnot pola je  :" + Math.round(sucet/n*1.00));
       // System.out.printf("\npriemer hodnot pola je %f2 :", ((double) sucet*1.00 / n));
        System.out.printf("\npriemer hodnot pola je %.2f :", (double) sucet / n);
    }
}


