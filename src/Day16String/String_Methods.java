package Day16String;

import java.sql.SQLOutput;

public class String_Methods {
    public static void main(String[] args) {

        String email="cybertek@gmail.com";
        email = email.replace("gmail", "yahoo");
        System.out.println(email);

        String word="java";

        word=word.replace("a", "e");
        System.out.println(word);

        word=word.replace("e","a");
        System.out.println(word);


        String sentence="I like to learn java, Java is cool, java is fun";
        sentence=sentence.replace("n java ", "n C# ");
        sentence=sentence.replace(", Java",  " Piton");
        System.out.println(sentence);

        String s1="I like to stay in Cybertek, Cybertek is good plase"; //MIT
        s1=s1.replace("Cybertek","MIT");

        String s2="I liek to leaRn Java";
        s2=s2.replace("liek", "like");
        s2=s2.replace('R', 'r');
        System.out.println(s2);

        //replaceFirst
        String s3="I like to drink  tea and tea";
        s3=s3.replaceFirst("tea", "coffee");
        System.out.println(s3);

        String s4="I like to watch Game of Thrones, and walking dead";
        s4= s4.replace(", and walking dead", "");
        System.out.println(s4);

        //indexOf (value)
        String s5="I like to stay in Cybertek, we are learning java";
                // 012345678901234567890123456789012345678901234567
        int r1=s5.indexOf("r");
        int r2= s5.indexOf("re");
        int r3=s5.indexOf("rn");

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

        //lastIndexOf
        String s6="Java is a programming language, and Java is fun";
        //         01234567890123456789012345678901234567890123456789
        int i1=s6.lastIndexOf("J");
        int i2=s6.lastIndexOf("Java is fun");
        System.out.println(i1);
        System.out.println(i2);

        //не працюючий варіант. Показує варіанти при неможливих умовах виконаннях.
        String s7="Java";
        int a1=s7.indexOf("A");
        System.out.println(a1);









    }
}
