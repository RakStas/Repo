package Day23Arrays;

import Day06.SalaryCalculator;

import java.util.Scanner;

public class month {
    public static void main(String[] args) {

        String [] month = {"Jun", "Feb", "march", "april", "may", "jun", "july", "Aug", "Sep", "oct", "nov", "dec"};

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter month between 1-12");
        int n = scan.nextInt();

        System.out.println(month[n-1]);


    }
}
