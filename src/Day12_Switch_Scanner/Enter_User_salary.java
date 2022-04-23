package Day12_Switch_Scanner;

import java.util.Scanner;

public class Enter_User_salary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter you salary ");
        double sal=scan.nextDouble();
        System.out.println("How many hours you work a week");
        double hours=scan.nextDouble();
        System.out.println("Your salary for one year is "+((sal*hours)*52));
    }
}
