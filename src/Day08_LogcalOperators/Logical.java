package Day08_LogcalOperators;

public class Logical {
    public static void main(String[] args) {

        /*
        !: opposite boolean
         */
        boolean r1= 9>7; //true
        boolean r2=!r1;
        System.out.println(r2);
        boolean r3 = !false==true;
        System.out.println(r3);
        boolean r4= true==!true;
        System.out.println(r4);
        boolean r5 = 9>5&&9>10;
        System.out.println("r5= "+r5);
    }
}
