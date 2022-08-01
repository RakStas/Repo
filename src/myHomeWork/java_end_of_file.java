package myHomeWork;

import java.util.Scanner;

public class java_end_of_file {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String a;
        int i=1;
        while (scan.hasNext()){
            a=scan.nextLine();
            System.out.println(i+" "+a);
            i++;
        }






    }
}
