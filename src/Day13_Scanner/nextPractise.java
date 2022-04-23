package Day13_Scanner;

import java.util.Scanner;

public class nextPractise {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Write your  name");
        String firstName = scan.next();
        String lastName = scan.next();
        String otherName = scan.next();
        System.out.println("Write your  gender");
        String gender = scan.next();
        System.out.println("Your name is "+firstName+" "+lastName+" "+otherName);
        System.out.println("Your gender is "+gender);

    }
}
