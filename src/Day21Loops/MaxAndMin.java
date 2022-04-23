package Day21Loops;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner can= new Scanner(System.in);
        int max=-999999999;
        int min =999999999;

        for(int i=1; i<=5; i++){
            System.out.println("Enter numbers");
            int num= can.nextInt();
            if(num<min){
                min = num;
            } if(num>max){
                max=num;
            }
        }
        System.out.println("max number is "+max+", "+"min number is "+min );


    }
}
