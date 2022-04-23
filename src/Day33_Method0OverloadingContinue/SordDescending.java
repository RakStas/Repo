package Day33_Method0OverloadingContinue;

import java.util.Arrays;

public class SordDescending {
    public static void main(String[] args) {


        /*int[] arr = {2, 3, 1, 5, 4};
        Arrays.sort(arr);
        int arr2[] = new int[arr.length];
        int count = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arr2[count] = arr[i];
            count++;
        }
        System.out.println(Arrays.toString(arr2));*/
        int score []={555,85,666,32};
        score = sortDescending(score);
        System.out.println(Arrays.toString(score));
        double sort[]={5.5,6,5.8,9.4};
        sort =sortDescending(sort);
        System.out.println(Arrays.toString(sort));
        String[] srt={"A", "F", "R"};
        srt = sortDescending(srt);
        System.out.println(Arrays.toString(srt));
    }

    public static int[] sortDescending(int arr[]) {
        Arrays.sort(arr);
        int arr2[] = new int[arr.length];
        int count = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arr2[count] = arr[i];
            count++;

        }
        return arr2;
    }
    public static double[] sortDescending(double arr[]) {
        Arrays.sort(arr);
        double arr2[] = new double[arr.length];
        int count = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arr2[count] = arr[i];
            count++;

        }
        return arr2;
    }
    public static String[] sortDescending(String arr[]) {
        Arrays.sort(arr);
        String arr2[] = new String[arr.length];
        int count = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arr2[count] = arr[i];
            count++;

        }
        return arr2;
    }
}