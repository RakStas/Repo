package Day25_Practice;

import java.util.Arrays;

/*write a program that can combine two arrays of integers and then print out the maximum number
            Ex:
                arr1 = { 1,2,3,4}
                arr2 = {5,6,7}

                output:
                    arr3 = {1,2,3,4,5,6,7}
                    max: 8*/
public class CompilerArrays_Max_Min {
    public static void main(String[] args) {
            int arr1[]={1,2,3};
            int arr2[]={4,5,6};
            int size= arr1.length+ arr2.length;
            int max = 0;
            int [] arr3=new int[size];
/*
            arr3[0]=arr1[0];
            arr3[1]=arr1[1];
            arr3[2]=arr1[2];

            arr3[3]=arr2[0];
            arr3[4]=arr2[1];
            arr3[5]=arr2[2];*/
            int index=0;
            for ( int each:arr1)
            {
                arr3[index]=each;
                index++;
            }
        for ( int each:arr2)
        {
            arr3[index]=each;
            index++;
        }

            Arrays.sort(arr3);
        System.out.println("Max is "+arr3[arr3.length-1]);




        System.out.println(Arrays.toString(arr3));
























    }
}
