package Day15_String;

import java.util.Locale;

public class String_Methods {
    public static void main(String[] args) {

        String name ="Cybertek School";
        //            012345678901234
                //charAt(index):
        char ch1=name.charAt(0);
        System.out.println(ch1);
        char ch2=name.charAt(5);
        System.out.println(ch2);

        System.out.println("==========================");
        int l=name.length();//length довжина, кількість сиволів у рядку ;
        System.out.println(l);
        //int  lastName=name.length();
        //char lastChar=name.charAt(lastName);
        //System.out.println(lastChar);
        System.out.println("==========================");

        //concat(Str): concatenation (додавання, що напишеш)
        String schoolName = "Cybertek";
            schoolName=schoolName.concat(" School");
        System.out.println(schoolName);

        String r1="Cybertek"+123+'A'+true;
        System.out.println(r1);

        String r2="Cybertek".concat("123");
        System.out.println(r2);

        System.out.println("==========================");
        //toLowerCase
        String name1="CYBERTEKSCHOOL";
         name1=name1.toLowerCase(); //cybertekschool
        System.out.println(name1);

        System.out.println("==========================");
        //toUpperCase
        String name2="stas";
        name2=name2.toUpperCase(Locale.ROOT);
        System.out.println(name2);

        //trim(): прибирає перші пробіли
        System.out.println("==========================");
        String p="         CyberTek    school     is    best ";
        String p1=p.trim();
        System.out.println(p1);

        //substring(): creates the subString of the String
        System.out.println("==========================");







    }
}
