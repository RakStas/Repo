package Day28_Recap;

import java.util.Arrays;

public class Multy3D_Arr {
    public static void main(String[] args) {
        int[][][] arr3D = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}},};
        System.out.println(Arrays.deepToString(arr3D));
        System.out.println(Arrays.deepToString(arr3D[1]));
        System.out.println(Arrays.toString(arr3D[1][1]));
        System.out.println(arr3D[1][0][1]);
        System.out.println("==========================");
        for (int i = 0; i <= arr3D.length - 1; i++) {
            int arrD2[][] = arr3D[i];
            for (int j = 0; j <= arrD2.length - 1; j++) {
                int arrD1[] = arrD2[j];
                for (int k = 0; k <= arrD1.length - 1; k++) {
                    int arrD0 = arrD1[k];
                    System.out.print(arrD0+" ");

                }System.out.println();

            }
        }
        System.out.println("======================");
        for (int [][] each2D :arr3D){
            for (int [] each1D:each2D){
                for (int each: each1D){
                    System.out.print(each+"  ");
                }
            }
            System.out.println();

        }

    }
}
