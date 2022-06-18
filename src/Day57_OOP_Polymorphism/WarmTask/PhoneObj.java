package Day57_OOP_Polymorphism.WarmTask;

public class PhoneObj {
    public static void main(String[] args) {
        Iphone IPhone1=new Iphone("Iphone", "11 pro", 550, "11");
        System.out.println(IPhone1);
       IPhone1.calling(66558);
       IPhone1.download();

       Phone iphone1=new Iphone("Iphone", "13 pro", 550, "11"); //polymorphism


       Samsung samsung=new Samsung("Samsung", "S22", 520, "5");
       samsung.freezing();
        System.out.println(samsung);
        samsung.download();

        Phone[] phones={iphone1, IPhone1, samsung};

    }


}
