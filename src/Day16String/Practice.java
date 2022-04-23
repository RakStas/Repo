package Day16String;

import java.util.Scanner;
 //with use ignore method
public class Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("are you are employed");
        String answer= scan.next();

        if (answer.equalsIgnoreCase("yes")){
            System.out.println("Employed");
        } else {
            System.out.println("Not employed");
        }



    }
}
