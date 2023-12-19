import java.util.Scanner;

public class Task {


    public static void main(String[] args) {
        // úvěr = 100.00 - 10,000.00  (mimo rozhraní je 5000)
        // splátky = 6 - 48 měsíců  (mimo rozhraní je 36)
        // úroky  6-12 =  2,5%
        //       13-24 =  5,0%
        //       25-48 = 10,0%
        //     - k výši úvěru
        // scanner bude získávat:
        //          - výší uvěru
        //          - počet splátek


        Scanner in = new Scanner(System.in);

        double amount = in.nextDouble();
        double minAmount = 100.00;
        double maxAmount = 10000.00;
        if (amount > maxAmount || amount < minAmount) {
            amount = 5000;
        }


        int month = in.nextInt();
        int minMonths = 6;
        int maxMonths = 48;
        if (month > maxMonths || month < minMonths) {
            month = 36;
        }

        if (month <= 12) {
            double monthWithInterest = amount * 1.025 / month;
            System.out.println(monthWithInterest);
        } else if (month <= 24) {
            double monthWithInterest = amount * 1.05 / month;
            System.out.println(monthWithInterest);
        } else {
            double monthWithInterest = amount * 1.10 / month;
            System.out.println(monthWithInterest);
        }
    }
}