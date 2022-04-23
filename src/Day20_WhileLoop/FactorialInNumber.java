package Day20_WhileLoop;

import java.util.Scanner;

public class FactorialInNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("write digits");
        int result = 1;
        for (int i= scan.nextInt();i>=1; i--){

            result*=i;
        }
        System.out.print(result);



    }
}
