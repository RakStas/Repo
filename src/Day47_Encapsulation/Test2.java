package Day47_Encapsulation;

public class Test2 {

    static int a=2;



    public Test2 (){
        a=4;
    }

    public static void main(String[] args) {
        new Test2();
        a=5;
        System.out.println(a);
    }

}
