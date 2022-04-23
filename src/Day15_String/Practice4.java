package Day15_String;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName=input.next();

        System.out.println("Enter your last name");
        String lastName=input.next();

        String fullName= (firstName.toUpperCase()+" "+lastName.toUpperCase());
        System.out.println(fullName);











    }
}
