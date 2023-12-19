package ukoly;

import java.util.Random;

public class SobotniUkol1 {

    public class InnerLoop2 {
        public static void main(String[] args) {
            //write program for little children
            //generate examples from a number as follow
            //i.e
            // a = 10
            // 1+1=
            // 1+2=
            //... 1+10=
            //2+1==
            //3+2....
            int a = 10;
            for (int i = 1; i <= a; i++) {
                for (int j = 1; j <= a; j++) {
                    //int choise = r.nextInt(1,4);
                    System.out.print(i + "+" + j + "=" + "\t\t");

                }
                System.out.println("---------");
            }

            //_+1=3
            //3+_=4
            //3+1=_
            //random, cases
            // Random r = new Random();
            // random next boolen
            //   do ifu boolen
            //     if -> if else
            Random r = new Random();

            int pocetPrikaldu = 10;

            for (int i = 0; i < pocetPrikaldu; i++) {

                int addend1 = r.nextInt(1, 4);
                int addend2 = r.nextInt(1, 4);
                int result = addend1 + addend2;

          /*  while (result >4) {
                addend1 = r.nextInt(1, 4);
                addend2 = r.nextInt(1, 4);
                result = addend1 + addend2;
            }
           */

                if (result > 4) {
                    i--;
                    continue;
                }

                int variant = r.nextInt(3);

                if (variant == 0) {
                    System.out.println("_" + "+" + addend2 + "=" + result);
                } else if (variant == 1) {
                    System.out.println(addend1 + "+" + "_" + "=" + result);
                } else {
                    System.out.println(addend1 + "+" + addend2 + "=" + "_");
                }

                // varianta se switch

                int variant2 = r.nextInt(3);

                switch (variant2) {
                    case 0:
                        System.out.println("_" + "+" + addend2 + "=" + result);
                        break;
                    case 1:
                        System.out.println(addend1 + "+" + "_" + "=" + result);
                        break;
                    default:
                        System.out.println(addend1 + "+" + addend2 + "=" + "_");
                        break;
                }
            }

        }
    }

}
