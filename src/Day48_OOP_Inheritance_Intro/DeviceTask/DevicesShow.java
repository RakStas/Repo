package Day48_OOP_Inheritance_Intro.DeviceTask;

public class DevicesShow {
    public static void main(String[] args) {


        Phone phone1=new Phone("iPhone", "XS", 1500, true, true, "iOS");

        phone1.Call(380980171);
        phone1.Text(54266);
        System.out.println(phone1);



    }
}
