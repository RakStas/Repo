package Day45_Java_Recap_Constructor;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;

public class Item_Release {
    public static void main(String[] args) {
        Item one1=new Item(2, 2500, "Iphone");
        Item one2=new Item(1, 3.1, "Samsung");
        Item one3=new Item(1, 4.6, "Huawei");
        Item one4=new Item(1, 5.1, "Oppo");
        double price=0;
        ArrayList<Item> list = new ArrayList<>(Arrays.asList(one1, one2, one3, one4));

        for(Item each:list){
            price+=each.costCalk();

        }
        System.out.println("Price 1 = "+price+" ");

        Item[] items={one1, one2, one3, one4};
        double price2=0;
        for(Item each: items){
            price2+=each.costCalk();
        }

        System.out.println("Price 2 = "+price2+" ");




    }
}
