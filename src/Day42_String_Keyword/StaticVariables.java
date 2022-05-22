package Day42_String_Keyword;
class Test{
    int a =10;
    static int b=10;




}
public class StaticVariables {
    public static void main(String[] args) {
        Test obj1=new Test();
        obj1.a=5;
        obj1.b=20;

        Test obj2=new Test();
        obj2.a=7;
        obj2.b=35;

        Test obj3=new Test();
        obj3.a=10;
        obj3.b=45;
        System.out.println(obj1.a);
        System.out.println(obj2.a);
        System.out.println(obj3.a);

        System.out.println(obj1.b);
        System.out.println(obj2.b);
        System.out.println(obj3.b);



    }





}
