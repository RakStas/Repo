package myHomeWork.Day12Task1;

import java.util.Arrays;

/*write a program that can combine two arrays of integers and then print out the maximum number
            Ex:
                arr1 = { 1,2,3,4}
                arr2 = {5,6,7}

                output:
                    arr3 = {1,2,3,4,5,6,7}
                    max: 8*/
public class MaxMin_Array {
    public static void main(String[] args) {
        int arr1[]={1,2,8,4,5};
        int arr2[]={12,7,8,45,10};
        int size = (arr1.length+arr2.length);
        int arr3[]=new int [size];
        int index=0;
        for (int each:arr1){
            arr3[index]=each;
            index++;
        }
        for (int each:arr2){
            arr3[index]=each;
            index++;
        }

        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
    }
}
