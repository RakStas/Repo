package Day33_Wrapper_Class_ArrayList_Intro;

import java.util.Scanner;

public class WrapperClass_Practice2 {
    public static void main(String[] args) {
        float a=Integer.MAX_VALUE;
        System.out.println(a);

        System.out.println("===========");
        Scanner scan = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i=1; i<=5; i++){
            System.out.println("Enter a number");
            int n = scan.nextInt();
        if (n  > max){
            max = n;
        }
            if ( n < min ){
                min = n;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }





}
