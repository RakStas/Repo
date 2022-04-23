package Day25_Practice;

import java.util.Arrays;

public class Array_1_100 {
    public static void main(String[] args) {
        int arr[]=new int[100];
        arr[0]=1;
        for(int i =0; i<= arr.length-1; i++){
            arr[i]=i+1;


        }
        System.out.print(Arrays.toString(arr));
        System.out.println();
        System.out.println("================");
        for (int each: arr){
            if (each%2!=0)
            System.out.print(each+" ");
        }
    }
}
