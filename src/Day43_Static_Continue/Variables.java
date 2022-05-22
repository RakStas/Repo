package Day43_Static_Continue;

public class Variables {

    int b;
    static int s;

    public void method2(){
        System.out.println(b);
        System.out.println(s);
    }

    public static void main(String[] args) {
        System.out.println(s);
        //System.out.println(b);        does no work

        Variables obj=new Variables();
        System.out.println(obj.b);   //only this way to use variable "b"

    }

    public static void method1(){
        int a;
    }
}
