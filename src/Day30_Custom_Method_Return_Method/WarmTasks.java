package Day30_Custom_Method_Return_Method;
/*
1. create a function that can print out the maximum number between two numbers

	2. create a function that can print out the array of integers in descending order

	3. create a function that can print out the combination of two integer arrays

	4.
		step1: create a function that can check if the given integer is positive, negative or zero

		step2: Use the above method to  write a program that can check every single elements of an array of Integers
 */

import java.util.Arrays;

public class WarmTasks {

    public static void main(String[] args) {
        taskOne(45, 85);
        System.out.println("=================");
        int arr1[]={45,778,454,8,4845,6999, 66575, -98};
        NumOfArray(arr1);
        int ar1[]={1,2,3};
        int ar2[]={4,5,6,7,8,9,10,11};
        task03_Combine2ARR(ar1,ar2);
        System.out.println("====================");

        PozNegZero(-5);
        System.out.println("arr positiveNegativeZero====================");
        int a3 []={300,-300,5252,-989,0,0,-65};
        for (int each:a3){
            PozNegZero(each);
        }
    }
    public static void taskOne(int one, int two){
        if (one>two){
            System.out.println(one+" is bigger number");
        } else if (two>one){
            System.out.println(two+" is bigger number");
        }else
            System.out.println("Digit is equal");


    }

    public static void NumOfArray (int arr[]){
       Arrays.sort(arr);
        for (int i = arr.length-1; i>=0; i--){

            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void task03_Combine2ARR (int [] arr1, int []arr2){
        int count =0;
        int [] ar3=new int [arr1.length+arr2.length];
        for (int each:arr1){
            ar3[count]=each;
            count++;
        }
        for (int each:arr2){
            ar3[count]=each;
            count++;
        }
        System.out.println(Arrays.toString(ar3));
    }
   //task4
    public static void PozNegZero(int num ){
        if (num<0){
            System.out.println(num+" is negative");
        } else if (num>0){
            System.out.println(num+" is positive");
        }else {
            System.out.println(num+" is zero");
        }
    }



}
