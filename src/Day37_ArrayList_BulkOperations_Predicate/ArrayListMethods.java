package Day37_ArrayList_BulkOperations_Predicate;

import java.util.ArrayList;
import java.util.Arrays;


public class ArrayListMethods {
    public static void main(String[] args) {
        //remove, size, set, get, equals, contains, clear
        ArrayList<String> cars = new ArrayList<>(Arrays.asList("BMW", "Skoda", "Mercedes",
                "Beauiq", "Lexus", "Toyota", "Tesla", "Tesla", "Tesla"));
        /*cars.remove("Toyota");
         System.out.println(cars);
         cars.removeAll(Arrays.asList("Skoda", "Lexus"));*/
        System.out.println(cars);
        /*cars.removeIf(p->p.toLowerCase(Locale.ROOT).contains("d"));
        System.out.println(cars);*/
        cars.retainAll(Arrays.asList("Tesla", "Mercedes"));

        cars.set(cars.indexOf("Toyota"), ("Volvo"));







    }



}
