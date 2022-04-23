package Day16String;

import java.util.Scanner;
/* ex:
            10
            20
            *
        output:
            200

            10
            2
            /
        output:
            5

    valid math operators are: *, / , +, -, %

    Nested If
*/
public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first number");
        double first = scan.nextDouble();
        System.out.println("Enter your second number");
        double second = scan.nextDouble();

        System.out.println("Enter your math operator");
        char oper=scan.next().charAt(0);

        boolean valid = oper=='*'||oper=='-'||oper=='+'||oper=='/'||oper=='%';
        if (valid){
            /*
            switch (oper) {
                case '*':
                    System.out.println(first*second);
                    break;
                case '+':
                    System.out.println(first+second);
                    break;
                case '/':
                    System.out.println(first/second);
                    break;
                case '-':
                    System.out.println(first-second);
                    break;
                default:
                    System.out.println(first%second);

            }
*/
        }
        else {
            System.out.println("it's don't work");
        }




    }
}
