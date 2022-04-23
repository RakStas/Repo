package Day18For_Loop;

import Day06.SalaryCalculator;

import java.util.Locale;
import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Write name");
        String firstName=scan.next();
        System.out.println( "write next word");
        String lastName= scan.next();
        /*String initial=firstName.substring(0,1)+"."+lastName.substring(0,1);
        initial=initial.toUpperCase(Locale.ROOT);

        System.out.println(initial);*/

        char frst=firstName.charAt(0);
        char scnd=lastName.charAt(0);
        String init=frst+"."+scnd;
        init=init.toUpperCase(Locale.ROOT);
        System.out.println(init);



    }
}
