package Day50_Inharitence_Method;

public class CarObject {
    public static void main(String[] args) {
        Honda honda=new Honda();
        Mercedes mercedes=new Mercedes();
        Jeep jeep=new Jeep();
        Tesla tesla=new Tesla();

        honda.Start();
        System.out.println("=======================");
        mercedes.Start();
        System.out.println("=======================");
        jeep.Start();

        System.out.println("=======================");
        tesla.Start();
        System.out.println("=======================");



    }

}
