package Day13_Scanner;

import java.util.Scanner;

public class nextLine_vs_nextMethods {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);


        System.out.println("Enter your salary");
        double salary = scan.nextDouble();

        scan.nextLine();

        System.out.println("Enter your full name");
        String name=scan.nextLine();



        System.out.println("Salary is: "+salary);
        System.out.println("Full name: "+name);









    }





}
