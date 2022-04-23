package Day22_Nested_Loop;

public class NestedLoop1 {
    public static void main(String[] args) {
        /*
           *******
           ******
           *****
           ****
           ***
           **
           *


          */
        for (int i = 7; i >= 1; i--) {

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 7; i++) {



            /*
                *
                **
                ***
                ****
                *****
                ******
                *******
             */

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
