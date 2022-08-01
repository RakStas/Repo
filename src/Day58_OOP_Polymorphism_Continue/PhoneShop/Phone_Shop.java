package Day58_OOP_Polymorphism_Continue.PhoneShop;
import Day57_OOP_Polymorphism.WarmTask.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Phone_Shop {
    public static void main(String[] args) {
        Phone[] phone = {
                new Iphone("Iphone", "12", 1000, "6.1"),
                new Samsung("Samsung","S20", 780, "7"),
                new Iphone("Iphone", "12", 1000, "6.1"),
                new Samsung("Samsung","S20", 780, "7"),
                new Iphone("Iphone", "12", 1000, "6.1"),
                new Samsung("Samsung","S20", 780, "7"),
                new Iphone("Iphone", "12", 1000, "6.1"),
                new Samsung("Samsung","S20", 780, "7"),
                new Iphone("Iphone", "12", 1000, "6.1"),
                new Samsung("Samsung","S20", 780, "7"),
                new Iphone("Iphone", "12", 1000, "6.1"),
                new Samsung("Samsung","S20", 780, "7"),
                new Samsung("Samsung","S20", 780, "7"),
                new Samsung("Samsung","S20", 780, "7"),
                new Samsung("Samsung","S20", 780, "7")
        };


        ArrayList<Phone>phoneShop=new ArrayList<>(Arrays.asList(phone));
        System.out.println(phoneShop);

        int countIphone=0;
        int countSamsung=0;

        for(int i=0; i<=phoneShop.size()-1; i++){
            if( phoneShop.get(i) instanceof Iphone  ){
                countIphone++;
            }else if (phoneShop.get(i) instanceof Samsung)
            {
                countSamsung++;
            }
        }
       /* for(Phone each  : phoneShop) {
            if (each instanceof Iphone) {
                countIphone++;
            }else if (each instanceof Samsung) {
                countSamsung++;
            }
        }*/
        System.out.println(countIphone);
        System.out.println(countSamsung);



    }
}
