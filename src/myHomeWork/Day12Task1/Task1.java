package myHomeWork.Day12Task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Wrine n1");
        int n1= scan.nextInt();
        System.out.println("Write n2");
        int n2= scan.nextInt();
        System.out.println("write n3");
        int n3= scan.nextInt();
        boolean N1=n1>n3&&n1>n2;
        boolean N2=n2>n1&&n2>n3;
        boolean N3=n3>n1&&n3>n2;
        if (N1){
            System.out.println(n1+" is biiger");
        }else if(N2)
        {
            System.out.println(n2+" is bigger");
        }else if (N3)
        {
            System.out.println(n3+" is bigger"            );
        }










    }
}
