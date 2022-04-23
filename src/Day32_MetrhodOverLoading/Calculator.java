package Day32_MetrhodOverLoading;
//  +  -  *  /  %

import java.util.Scanner;

public class Calculator {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        double firstNum = scan.nextDouble();
        System.out.println("Enter operator");
        char ch = scan.next().charAt(0);
        System.out.println("Enter second number");
        double secondNum= scan.nextDouble();
        double result = Calculator(firstNum, ch, secondNum);
        System.out.println("Your result is "+result);

    }
    public static double Calculator(double num1, char oper, double num2) {
    double result =(oper=='+')?num1+num2:(oper=='-')?num1-num2:(oper=='+')?num1+num2:
            (oper=='*')?num1*num2:(oper=='/')?num1/num2:(oper=='%')?num1%num2:0;




        return result;
    }
}