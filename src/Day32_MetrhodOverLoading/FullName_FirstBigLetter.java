package Day32_MetrhodOverLoading;

import java.io.FilterOutputStream;
import java.util.Locale;
import java.util.Scanner;

public class FullName_FirstBigLetter {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String firstName = scan.nextLine();
        String lastName = scan.nextLine();
        String newName = FormatFull_name("StanislaV", "rAk");
        System.out.println(newName);
    }

        public static String FormatFull_name(String firstName, String lastName){
            firstName = firstName.substring(0,1).toUpperCase(Locale.ROOT) + firstName.substring(1).toLowerCase(Locale.ROOT);
            lastName  = lastName.substring(0,1).toUpperCase(Locale.ROOT)+lastName.substring(1).toLowerCase(Locale.ROOT);
            String fullName = (firstName + " "+lastName);
        return fullName;
        }
}
