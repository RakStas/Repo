package Day15_String;

import java.util.Scanner;

public class Pactice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write name");
        String firstName= scan.next();

        System.out.println("Write last name");
        String lastName=scan.next();


        String fullName =firstName.concat(" "+lastName);

        System.out.println(fullName);








    }

}
