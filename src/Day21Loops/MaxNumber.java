package Day21Loops;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max=-2147483648;

        for(int i =1; i<=5; i++){
            System.out.println("Enter number");
            int num1= scan.nextInt();
            if (max<num1){
                max=num1;
            }

        }
        System.out.println("Bigger number is "+max);











    }
}
