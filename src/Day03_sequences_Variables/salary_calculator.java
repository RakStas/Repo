package Day03_sequences_Variables;

public class salary_calculator {
    public static void main(String[] args) {

        int salary = 100000;
        double tax = 0.28;
        double totalTax = salary*tax;
        double salaryAfterTax = salary-totalTax;

        System.out.println(totalTax);
        System.out.println(salaryAfterTax);




    }



}
