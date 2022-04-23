package Day14_Recap;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class scanner_Practise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /* gender
                 age
                   country

                    zip code
                    full name of the person:
                    full company name*/
        System.out.println("Enter your gender");
        String gender = scan.next();
        scan.nextLine(); // кожного разу після викоритсання сканеру потрібно заново починати команду сканер
        System.out.println("Write your age");
        int age =scan.nextInt();

        scan.nextLine(); // кожного разу після викоритсання сканеру потрібно заново починати команду сканер
        System.out.println("Write name your country");
        String country= scan.nextLine();


        System.out.println("write please your zipcode");
        int zipcode = scan.nextInt();

        System.out.println("Your full name");
        scan.nextLine();
        String namePerson= scan.nextLine();


        System.out.println("Write name your company");
        String company= scan.nextLine();


        System.out.println("Your gander is "+gender);
        System.out.println("you have" +" "+age+" "+"years old ");
        System.out.println(" Your country is "+country);
        System.out.println("zipcode "+zipcode);
        System.out.println("Your full name is "+namePerson);
        System.out.println("Name company "+company);




    }



}
