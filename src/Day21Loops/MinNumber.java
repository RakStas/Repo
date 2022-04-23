package Day21Loops;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int integer = 999999999;
        for (int i=1; i<=5; i++){
            System.out.println("Write your number");
            int min1= scan.nextInt();
            if(min1<integer){
                integer=min1;
            }
        }
        System.out.println("Minimum number is "+integer);




    }
}
