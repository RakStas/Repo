package Day33_Method0OverloadingContinue;

import java.util.Arrays;

public class Calculate {
    public static void main(String[] args) {
        float num1=5;
        float num2=10;
        System.out.println(calculator(num1, num2));
        System.out.println(calculator(5.5, 6.7));
        long l1=100;
        long l2=200;
        System.out.println(multiplication(l1, l2));



     /*   int arr[]={5,9,2,1,4,3,7,6,8};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        char ch[]={'a','f','r','a'};
        Arrays.sort(ch);
        System.out.println(ch);*/
    }
    public static int calculator (int num1, int num2){
        return num1+num2;
    }
    public static double calculator (double num1, double num2){
        return num1+num2;
    }
    public static float calculator (float num1, float num2){
        return num1+num2;
    }
    public static int multiplication (int a, int b){
        return a*b;
    }
    public static double multiplication(double a, double b){
        return a*b;
    }
}
