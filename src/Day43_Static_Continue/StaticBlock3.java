package Day43_Static_Continue;

import java.util.ArrayList;
import java.util.Arrays;

public class StaticBlock3 {
    static int a;
    static  int b;
    static int c;


    static {
        a=100;
        b=200;
        c=300;

    }

    public static void main(String[] args) {
        System.out.println(StaticBlock3.a);
        System.out.println(StaticBlock3.b);
        System.out.println(StaticBlock3.c);


    }

}
