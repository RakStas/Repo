package Day14_Recap;

import java.util.Scanner;

public class nextLine_vs_Rest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter your age");
        int age = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your full name");
        String name = scan.nextLine();

        System.out.println("Enter your company name");
        String companyName = scan.nextLine();


        System.out.println("Your name is: "+name+", your age is: "+age+" years old, and you work at company "+companyName);










    }


}
