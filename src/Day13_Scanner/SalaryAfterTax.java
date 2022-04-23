package Day13_Scanner;

import java.util.Scanner;

public class SalaryAfterTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Print your annual salary");
        double salary = input.nextDouble();
        System.out.println("Write your state tax rate");
        double stateTaxRate = input.nextDouble(); //0.08
        double stateTax = salary * stateTaxRate;

        System.out.println("Write your federal tax rate");
        double federalTaxRate = input.nextDouble();//0.2
        double federalTax = salary * federalTaxRate;

        double salaryAfterTax = salary - stateTax - federalTax;

        System.out.println("Your annual salary is $"+salary );
        System.out.println("Your state tax is:$ "+salaryAfterTax);
        System.out.println("Federal tax is: $"+federalTax);
        System.out.println("Your salary after tax $"+salaryAfterTax);
    }

    }



