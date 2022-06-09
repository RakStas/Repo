package Day47_Encapsulation;

public class Test {
    public static void main(String[] args) {
        /*System.out.println(AccessModifiers.publicVariable);
        AccessModifiers.publicMethod();

        System.out.println(AccessModifiers.defaultVariable);
        AccessModifiers.defaultMethod();*/

        Encapsulation obj1=new Encapsulation();
        System.out.println(obj1.getSnn());

        obj1.setSnn(1458);
        System.out.println(obj1.getSnn());



    }
}
