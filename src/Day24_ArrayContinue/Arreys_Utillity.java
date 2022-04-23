package Day24_ArrayContinue;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Arrays;

public class Arreys_Utillity {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        System.out.println(arr);//не коректно працює
        System.out.println(Arrays.toString(arr)); //коректно працює

        String r=Arrays.toString(arr);
        System.out.println(r);

        String [] names={"Muhtar", "Asia","Saim", "Stas"};
        System.out.println(Arrays.toString(names));

        Arrays.sort(names);    //Array sort сортує масив від 0-9, A-Z.
        System.out.println(Arrays.toString(names));

        int [] nums = {1,5,8,6,4,7,8};
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println("Maximum number "+nums[nums.length-1] );
        System.out.println("Min number "+nums[0]);

        System.out.println("======================");
        int [] arr1={1,2,3};
        int [] arr2={1,2,3};
        boolean r1= Arrays.equals(arr1, arr2); // порівнює аррей, якщо однакові то тру, якщо різні фалс
        System.out.println(r1);
        int [] arr3={2,1,3};
        Arrays.sort(arr3);
        boolean r2 = Arrays.equals(arr3, arr1);
        int [] arr4={1,1,2,3};
        int [] arr5={1,2,3};
        boolean r3=Arrays.equals(arr4, arr5);
        System.out.println(r3);
        System.out.println(r2);
    }
}
