package Day28_Recap;

import java.util.Arrays;

public class Multy_D_Array {
    public static void main(String[] args) {
        //              0 1 2   0 1 2 3 4   0 1  2  3  4
        int [][]arr2d={{1,2,3},{4,5,6,7,8},{9,10,11,12,13}};
                  //      0          1            2
        //System.out.println(Arrays.toString(arr2d[1])); //single
       // System.out.println((arr2d[1][2]));// Multi
       // System.out.println("===================");
       /* for (int i = 0; i <= arr2d.length-1 ; i++) {
            int [] eacharr1d =arr2d[i];

          // System.out.print(Arrays.toString(eacharr2d)+"; ");
            for (int j =0; j<=eacharr1d.length-1; j++){
                int eachNum  = eacharr1d[j];
                System.out.print(eachNum+" ");

            }
            System.out.println();
        }*/
        for(int [] each1d: arr2d){
            for (int element:each1d){
                if (element %2!=0){
                    System.out.print(element+" ");
                }

            }
            System.out.println();
        }




    }
}
