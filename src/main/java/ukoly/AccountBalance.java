package ukoly;

import java.util.Scanner;

public class AccountBalance {

    public static void main(String[] args) {

        //write program to calculate balance for particular months
        //see src/main/resources/account.txt

        //magic code, will explain at the weekend
        Scanner scanner = new Scanner(AccountBalance.class.getResourceAsStream("/account.txt"));

        //here will be probably array for store balance for particular month

        while (scanner.hasNext()){
            String line= scanner.nextLine();
            //line contains lines of
            //month ammount, i.e
            //1 2000
            //1 -200
            //1 -100 etc...
            //split line by " " and use first item for month and second as ammount
        }
        //print each month number and month balance in format
        //month number:balance Kc, if balance is negative, print "!" at the end of line i.e
        //1:300 Kc
        //2:-20 Kc !!!

        //print total year blance i.e. for
        //1:300 Kc
        //2:-200 Kc
        //you should print
        //year balance: 100 Kc
    }
}
