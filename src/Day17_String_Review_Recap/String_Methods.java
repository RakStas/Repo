package Day17_String_Review_Recap;

import java.util.Locale;

public class String_Methods {
    public static void main(String[] args) {
       /* String methods: charAt, +, length, upper, lower, trim, substring,
                replace, replaceFirst, indexOf, lastIndexOf, equals, equalsIgnorecase,
                isEmpty, ends, starts, contains*/

        //charAt();
        String str="Cybertek";
        //          012345678
           char ch1= str.charAt(7);
        System.out.println("charAt "+ch1);

        //+
        String str2="Cybertek";
        str2=str2+" School";

        //length()
        String str3="Cybertek";
        int l =str3.length();//8
        System.out.println("Length "+l);

        //lastindex: length-1
        char ch2=str3.charAt(l-1);//(length -1) =7==k
        System.out.println("LastIndex "+ch2);

        //upperCase & lowerCase
        String str4 = "Cybertek";
        str4=str4.toUpperCase(Locale.ROOT);//CYBERTEK
        System.out.println(str4);
        str4=str4.toLowerCase();//cybertek

        //trim()
        String str6="      Cybertek     ";
        str6=str6.trim();
        System.out.println("Trim; I like "+str6);//I like Cybertek

        //subString
        String str7="I like java language because its funny";
        //           012345678901234567890
        String word=str7.substring(7, 11); //java
        String word2=str7.substring(12); //language
        System.out.println("SubString "+word2);

        String word4=str7.substring(2, 6);//like
        System.out.println(word4);

        //indexOf & lastIndexOf==>int
        String str8  ="Hello Batch 20, I have Wonderful day, We are happy to see you";
        int num = str8.indexOf("Wonder");
        System.out.println("IndexOf: "+num); //23
        System.out.println(str8.charAt(num)); //W

        int i2=str8.indexOf(", W") +2; //38
        int i3=str8.indexOf("We"); //38

        System.out.println(i2);
        System.out.println(i3);

        String str9="Java Java Java";
        //           01234567890
        int i4 =str9.lastIndexOf("J");
        int i5=str9.indexOf("J");
        int i6=str9.indexOf(" J");

        System.out.println(i4);//10
        System.out.println(i5);//0
        System.out.println(i6+1);//5

        //replace & replaseFirst
        String str10 = "I like java language, java is programing language";
       // str10 = str10.replace("java", "Pyton"); //присвоює нове значення всим значення які вводиш
        //System.out.println("Replace: "+str10);
        str10=str10.replaceFirst("java", "C#");//присваює нове значення тальки перщшомму значеню
        System.out.println(str10);
















    }
}
