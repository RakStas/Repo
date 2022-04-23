package Day23Arrays;

import java.util.Locale;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        while(true){

            System.out.println("Enter first numbers");
            double num1= scan.nextDouble();
            System.out.println("Enter second number");
            double num2= scan.nextDouble();

            System.out.println("Enter math operator");
            char oper = scan.next().charAt(0);

            /*
              програма через if
            double result=(oper=='+')? num1+num2:(oper=='-')? num1-num2:(oper=='*')
                    ? num1*num2:(oper=='/')? num1/num2:(oper=='%')? num1%num2:0;


            System.out.println(result);
            програма через switch
            */

            switch (oper){
                case '+':
                    System.out.println(num1+num2);
                    break;
                case '-':
                    System.out.println(num1-num2);
                    break;
                case '*':
                    System.out.println(num1*num2);
                    break;
                case '/':
                    System.out.println(num1/num2);
                    break;
                case '%':
                    System.out.println(num1%num2);
                    break;

                default:
                    System.out.println("Invalid operator");
            }



            System.out.println("Do you want play game again?");

            String answer= scan.next().toLowerCase(Locale.ROOT);

            while ( !(answer.equals("yes")||answer.equals("no")))
            {
                System.out.println(answer+" is invalid answer, enter YES or NO");
                System.out.println("Do you want to continue?");
                answer= scan.next().toLowerCase(Locale.ROOT);

            }

            if (answer.equals("no")){
                break;

            }


        }










    }
}
