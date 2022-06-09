package Day51Expections.BrouserTask.BruwsersTask.SuperClass;

class C{
    public C(int a){
        System.out.println("Super class' int arg constructor");
    }
}


public class SuperKeyWord3 extends C{
    public SuperKeyWord3(int a) {
        super(a);
        System.out.println("With int arg");
    }

    public static void main(String[] args) {
        new SuperKeyWord3(100);
        SuperKeyWord3 obj1=new SuperKeyWord3(125);
        System.out.println(obj1);
    }
}
