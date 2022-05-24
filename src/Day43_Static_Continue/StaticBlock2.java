package Day43_Static_Continue;



public class StaticBlock2 {
        static int a;
        static String b;
        //static Tester tester1;
        //static Tester tester2;
        static {
            a=100;
           b="the word";

          // tester1=new Tester();
        //   tester1.setInfo("Aloha", 123, "Qa", 1202, 'M');

           // tester2=new Tester();
          //  tester2.setInfo("Valya", 123, "Qa", 1202, 'M');

        }



    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
    }

}
