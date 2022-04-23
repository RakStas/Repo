package Day08_LogcalOperators;

public class Post_Pre {
    public static void main(String[] args) {
        int a = 200;
        int b = -a++ + - --a*a--%2;
             //-200-200*0
        System.out.println(b);


    }
}
