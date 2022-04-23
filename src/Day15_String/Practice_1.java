package Day15_String;

import java.util.Scanner;

public class Practice_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Write your name");

        String firstName = scan.next();

        System.out.println("write your last name");
        String secondName = scan.next();

        char ch1=firstName.charAt(0);
        char ch2=secondName.charAt(0);
        System.out.println("First letters of your name are: "+ch1+"."+ch2+".");



    }





}
