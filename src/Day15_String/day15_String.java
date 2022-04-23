package Day15_String;
import java.lang.String;
import java.util.Scanner;

public class day15_String {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        String name="Cybertek"; //in string pool
        String name2=new String("Cybertek"); //in heap (heap переводиться купа, багато, кагат, маса)

        String s1="cat";//string literal; s1==s2 !=s3
        String s2="cat";//string literal; s2==s1 !=s3
        String s3=new String("cat");//string pool, and string is one, without double

        String t1 =new String("Tiger"); //t1!=t2
        String t2= new String("Tiger"); //t2!=t1
        System.out.println(t1==t2); //false










    }
}
