package Day15_String;

import javax.lang.model.element.NestingKind;
import java.util.Locale;

public class subString_Method {
    public static void main(String[] args) {
        String sentence="Java is fun";
        //               0123456789...
        // substring (begining index, end index)
        String word=sentence.substring(0, 10 );
        System.out.println(word);
        String sentences2= "I like movies and T Series";
                    //      012345678901234567890123456789

        String word3=sentences2.substring(7,12);
        System.out.println(word3);
        System.out.println("============================");

        String firstName="RaKsTAs";
        String  firsCharacter=firstName.substring(0,1);
        String rest = firstName.substring(1, firstName.length());

        firstName=firsCharacter.toUpperCase()+rest.toLowerCase();

        System.out.println(rest);
        System.out.println(firstName);


        System.out.println("=========================");
        String lastName="School";
        String firstChar =lastName.substring(0,1); //s
        String remaining=lastName.substring(1);//chool;
        System.out.println(firstChar);
        System.out.println(remaining);
        lastName=firstChar.toUpperCase()+remaining.toLowerCase();
        System.out.println(lastName);


        String s= "I like Game Of Thrones";
                 //0123456789
        String series=s.substring(7);


        String s2="I like Java Programing Language";
                // 0123456789012345678901234567890
        String java=s2.substring(7, 11);
                System.out.println(java);







    }
}
