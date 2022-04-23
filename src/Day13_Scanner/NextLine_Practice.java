package Day13_Scanner;

import java.util.Scanner;

public class NextLine_Practice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your building number");
        int numBuild= scan.nextInt();//758

        scan.nextLine();

        System.out.println("Enter your street name");
        String streetName = scan.nextLine();


        System.out.println("Build number is: "+numBuild+"; "+"Street's name is: "+streetName);
        scan.close();








    }



}
