package Day29_Custom_Method;


public class Eligible2_Calculator {
    public static void main(String[] args) {
        calculator(10, '*',15);
    }
    public static void calculator(double num1, char operator, double num2) {
        //+, -, /, *, %


        switch (operator) {
            case '+':
                System.out.println("Addition "+(num1+num2));
                break;
            case '-':
                System.out.println("Substraction " +(num1-num2));
                break;
            case '*':
                System.out.println("Multiplication "+(num1*num2));
                break;
            case '/':
                System.out.println("Division "+(num1/num2));
                break;
            case '%':
                System.out.println("Remainder "+(num1%num2));
                break;
            default:
                System.out.println("Invalid Operator");
        }


    }
}


