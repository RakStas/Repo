package Day08_LogcalOperators;

public class Practice3 {
    public static void main(String[] args) {
        int b = 2;
        boolean res = ++b==2||--b==2&&--b!=2;
        System.out.println(res);


        int  c= 5;
        boolean r2 = c++==6||c--==5||c==5;
        /*           5==6  || 6==5 ||c==5
                      false||false ||true
         */
        System.out.println("==============");
        boolean A = true;
        boolean B = !A;
        boolean C = A != B && A == !B && !A == B;
            //



    }
}
