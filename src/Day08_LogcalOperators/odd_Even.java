package Day08_LogcalOperators;

public class odd_Even {
    public static void main(String[] args) {

         int number = 102;
         boolean even = number%2==0;
         boolean odd = !even;
         if (even) {
             System.out.println( number+" is even");
         }
        if (odd) {
            System.out.println(number + " isnt even");
        }


    }
}

