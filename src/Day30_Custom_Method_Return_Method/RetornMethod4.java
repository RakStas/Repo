package Day30_Custom_Method_Return_Method;

import java.util.Arrays;


public class RetornMethod4
{
    public static void main(String[] args) {
        int a1 []={4,5,6,};
        int b2 [] = {1,2,3};
        int []c=task03_Combine2ARR(a1, b2);
        System.out.println(Arrays.toString(c));
    }

    public static int [] task03_Combine2ARR(int[] arr1, int[] arr2) {
        int count = 0;
        int[] ar3 = new int[arr1.length + arr2.length];
        for (int each : arr1) {
            ar3[count] = each;
            count++;
        }
        for (int each : arr2) {
            ar3[count] = each;
            count++;
        }
        return ar3;
    }
}
