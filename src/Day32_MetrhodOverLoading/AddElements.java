package Day32_MetrhodOverLoading;

import java.util.Arrays;

public class AddElements {
    public static void main(String[] args) {
        /*int arr[] = {1, 2, 3, 4};
        int single = 5;
        int arrResult[] = new int[arr.length + 1];
        arrResult[arrResult.length - 1] = single;
        int count = 0;
        for (int each : arr) {
            arrResult[count] = each;

            count++;
        }
        System.out.println(Arrays.toString(arrResult));*/
        int [] arr1= {2,5,8,9,7};
                int s = 99;

        arr1=element(arr1,s );
        System.out.println(Arrays.toString(arr1));


    }

    public static int[] element(int[] arr, int single) {

        int arrResult[] = new int[arr.length + 1];
        arrResult[arrResult.length - 1] = single;
        int count = 0;
        for (int each : arr) {
            arrResult[count] = each;

            count++;
        }

        return arrResult;
    }
}




