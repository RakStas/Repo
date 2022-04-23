package Day16String;

public class String_Methods2 {
    public static void main(String[] args) {
//isEmpty
        String name1="Cybertek";
        System.out.println(name1.isEmpty());
        String name2="";
        System.out.println(name2.isEmpty());

//eqials
        String s3=new String("Java");
        String s4=new String("Java");
        System.out.println(s3==s4);

        String s5= "Java";
        String s6="Java";
        System.out.println(s5.equals(s6) );
        System.out.println(s5==s6);

//contains
        String  str = "I like to learn java programing language";
        System.out.println(str.contains("python")); //false
        System.out.println(!str.contains("python"));//true
        System.out.println(str.contains("JAVA")); //false

        System.out.println(str.contains("java"));//true

 //stratsWith():     'boolean'
        String s1="Muhtar";
        System.out.println(s1.startsWith("M")); //true
        System.out.println(s1.startsWith("J")); //False

        System.out.println(s1.startsWith("Mu")); //true








    }

}
