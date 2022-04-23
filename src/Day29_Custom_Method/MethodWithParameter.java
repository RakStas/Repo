package Day29_Custom_Method;

import java.util.Scanner;

public class MethodWithParameter {
    public static void main(String[] args) {
     printHello(5);
     calculateAge(1993, 2022);
    }
    public static void printHello(int n){
        int k=0;
        for (int i =0; i<n; i++){
            k++;
            System.out.println(k+" Hello world; ");
        }
    }

        public static void calculateAge(int parameter, int actualYear){
        if (actualYear<parameter){
            System.out.println("Invalid");}
       else { int age = actualYear-parameter;
            System.out.println("You are "+age+" years old");}

        }


}
