package Day33_Wrapper_Class_ArrayList_Intro;

public class WrapperClass {
    public static void main(String[] args) {
        Integer  num=100;
        int a =100;


        int b=num;
        System.out.println(b);
        Byte k=50;
        int l=k;

        byte k1=50;
       // Integer l1=k1; compiler err
        int arr []=new int [3];


        Double dobl=300.0;
        double dobl1=dobl; //unboxing;

        long ll=100;
        Long ll1=ll;       //autoboxing

        Float fl=100f;     // important give f in the end



    }
}
