package Day17_String_Review_Recap;

import javax.xml.bind.SchemaOutputResolver;

public class String_Methods2 {
    public static void main(String[] args) {

        String s1= "Cat"; //String pool
        String s2 = new String("Cat"); //Heap
        String s3 = new String("Cat");

        System.out.println(s1==s2);        //false
        System.out.println(s1.equals(s2)); //true

        System.out.println(s2==s3);        //false
        System.out.println(s2.equals(s3)); //true

        String s4 ="java";
        String s5= "Java";
        System.out.println(s4.equals(s5));           //false
        System.out.println(s4.equalsIgnoreCase(s5)); //true

        //isEmpty
        //показує чи пустий рядок. Якщо пустий=>true, якщо щось є =>false
        String s6="";
        System.out.println(s6.isEmpty()); //true
        String s7=" ";
        System.out.println(s7.isEmpty()); //false
        s7=s7.trim();//"" true

        //contains: included or not;
        String str3="Java, C#, Python, Ruby, C++";
        System.out.println(str3.contains("Java")); //true
        System.out.println(str3.contains("java")); //false

        String str4="ABCD";
        System.out.println(str4.contains("D"));//true

        //startsWith & endsWith: показує з якої букви починається чи закінчується умова.

        String str5="Cybertek";
        System.out.println(str5.startsWith("C")); //true
        System.out.println(str5.endsWith("K")); //false

        String str6="Today is great day";
        System.out.println(str6.endsWith("day")); //true









    }
}
