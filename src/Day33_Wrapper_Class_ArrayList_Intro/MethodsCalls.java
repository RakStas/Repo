package Day33_Wrapper_Class_ArrayList_Intro;
import Library.Util;

import java.util.Arrays;

public class MethodsCalls {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]={6,7,8,9};
         int[] arr3=Util.combine2Arrays(arr1, arr2);
        System.out.println(Arrays.toString(arr3));
        Integer arr4[]={11,23,45};
        Integer arr5[]={78,98,55};
        Integer arr6[]=Util.combine2Arrays(arr4, arr5);
        System.out.println(Arrays.toString(arr6));

        int max =Util.maxNum(arr3);

        int min=Util.minNum(arr1);
        System.out.println("Max is "+max+"; min is "+min);

        int[] arr7 =Util.sortDesc(arr2);
        System.out.println(Arrays.toString(arr7));



    }
}
