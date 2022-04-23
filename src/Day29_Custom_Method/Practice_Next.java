package Day29_Custom_Method;

import java.util.Scanner;

public class Practice_Next {
    public static void main(String[] args) {

    }

    public static void VoteAndAlcohol(String name, int age, boolean citizen ) {
        Scanner scan = new Scanner(System.in);
        boolean eligibal = age >=18&&citizen==true;
        int rule = 18;
        if (eligibal){
            System.out.println(name+" eligible to vote");
        }

     //   int age = scan.nextInt();

     //   String nationality = "UA";
     //   if (age >= rule) {
     //       System.out.println("You can buy alcohol");

     //   }

    }

}








