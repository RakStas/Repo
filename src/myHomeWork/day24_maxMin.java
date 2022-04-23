package myHomeWork;

import java.util.Scanner;

public class day24_maxMin {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
        System.out.println("how much");
    int n = scan.nextInt();
    int [] arr =new int[n];
    for (int i=0; i<=n-1; i++){
        System.out.println("Enter digit");
        int num = scan.nextInt();
        arr[i]=num;
    }
    int max=arr[0];
    int min =arr[0];

        for (int i=0; i<=arr.length-1; i++){
            System.out.print(arr[i]+", ");
            if (arr[i]>max){
                max=arr[i];
            }
            if (arr[i]<min){
                min=arr[i];
            }

            }
        System.out.println();
        System.out.println( "max is "+ max +", min is "+min             );
        }

    }









