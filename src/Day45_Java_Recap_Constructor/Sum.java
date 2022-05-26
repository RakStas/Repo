package Day45_Java_Recap_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class Sum {
    public Sum(int a, int b){
        System.out.println("result is "+ (a+b));
    }
    public Sum(double a, double b){
        System.out.println("result is "+ (a+b));
    }
    public Sum(int a, int b, int c){
        System.out.println("result is "+ (a+b+c));
    }
    public Sum(double e, double f, double g){
        System.out.println("result is "+ (e+f+g));
    }
    public static void main(String[] args) {
        Sum obj1=new Sum(45, 25);
        Sum obj2=new Sum(45.1,5.3);
        Sum obj3=new Sum(45, 25, 15);
        Sum obj4=new Sum(12.3, 114.3, 12.6);


    }




}
