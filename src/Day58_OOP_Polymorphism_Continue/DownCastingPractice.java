package Day58_OOP_Polymorphism_Continue;

import Day57_OOP_Polymorphism.WarmTask.Iphone;
import Day57_OOP_Polymorphism.WarmTask.Phone;

public class DownCastingPractice {
    public static void main(String[] args) {

        Phone phone=new Iphone("Iphone", "22", 11, "M");

        Iphone iphone = (Iphone) phone;

        iphone.FaceTime(555);

        }


    }




