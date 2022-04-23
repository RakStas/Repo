package Day06;



public class SalaryCalculator {
    public static void main(String[] args) {
        /*rate =55
        stateTaxRate = 0.04
        FederalTaxRate = 0.22
        weekly Hours = 40

        your salary is 105600 USD
        YourTaxRate = 27456 UDS
        your income after tax is: 78144 USD



         */
        double rate = 55.44;
        double stateTaxRate = 0.08;
        double federalTax = 0.22;
        int weeklyHours = 48;
         double salary = rate*weeklyHours*48;
         double totalTax = (stateTaxRate+federalTax)*salary;
        System.out.println("your salary is "+salary+"$");
        System.out.println("Your taxRate "+totalTax+"$");
        System.out.println("your income after tax "+(salary-totalTax)+"$");










    }
}
