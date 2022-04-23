package Day12_Switch_Scanner;


import java.util.Scanner;

public class user_inPut_Practise1 {

    /*write a program for the rate calculator: RateCalculator
            1. asks the user to enter the salary (as double)
            2. asks the user how many hours does he/she works in a week (as int)
            3. print the hourly rate of the employee

            assume that one year has 52 weeks

            hourRate = salary/ (weeklyHour * 52)*/
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter you number ");
        double num = scan.nextDouble();
        String result=(num%2==0)?"Even":"Odd";
        System.out.println(result);












    }

}
