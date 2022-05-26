package Day46_ConstructorsContinueConstructorCalls;

import java.util.ArrayList;
import java.util.Arrays;

public class CarRunConstructor {
    public static void main(String[] args) {
        CarConstructor car1=new CarConstructor("Mersedes");
        CarConstructor car2=new CarConstructor("Audi", "A100");
        CarConstructor car3=new CarConstructor("BMW", "750", 21544);
        CarConstructor car4=new CarConstructor("Tesla", "90D", 150000, 2020);
        CarConstructor car5=new CarConstructor("Volvo", "V40", 5000.4, 2019, "Grey");

        System.out.println(car1);

        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);

        ArrayList<CarConstructor>list=new ArrayList<>(Arrays.asList(car1, car2, car3, car4,car5));

        System.out.println("we have "+list.size()+" cars at our parking place");

    }
}
