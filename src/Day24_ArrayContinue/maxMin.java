package Day24_ArrayContinue;

import java.util.Scanner;

public class maxMin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many number do you want to enter? ");
        int n =scan.nextInt();
       int [] arr=new int[n];
       for (int i=0; i<=n-1; i++){
           System.out.println("Enter number");
           int num = scan.nextInt();
           arr[i]=num;
           }
            int max=arr[0];
            int min =arr[0];
        for (int i=0; i<=arr.length-1; i++){
            System.out.print(arr[i]+" ");
            if(arr[i] > max){
                max=arr[i];
            }
            if(arr[i] < min){
                min=arr[i];
            }
       }
        System.out.println();
        System.out.println("max is "+max);
        System.out.println("min is "+min);



    }
}
