package Day14_Recap;

import java.util.Scanner;
/*                  building number
                    Street address (Assume it has more than one word)
                    city name
                    state name
                    zip code
                    full name of the person*/
public class Addres {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("building number ");
        int number = scan.nextInt();


        System.out.println("Street address ");
        scan.nextLine();
        String streetAddress = scan.nextLine();


        System.out.println("city name ");
        String cityName = scan.nextLine();

        System.out.println("write your state name ");
        String state = scan.nextLine();

        System.out.println("Write ZIP code ");
        int zip = scan.nextInt();

        scan.nextLine();

        System.out.println("write your full name of person");
        String fullName = scan.nextLine();

        /*ex output:
        Ship To:    Jimmy joe
                    7925 Jones Branch Dr
                    MCLean, VA 22102*/
        System.out.println("Letter will be send to:");
        System.out.println(fullName+"\n"+number+" "+streetAddress+"\n"+cityName+" "+state+" "+zip);









    }
}
