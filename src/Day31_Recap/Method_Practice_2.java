package Day31_Recap;

import java.util.Locale;

public class Method_Practice_2 {
    public static void main(String[] args) {
        Reverse("Kolobok");


        String newLine = "PamPam";
        System.out.println(newLine.equalsIgnoreCase(ReverseStr(newLine)));
    }
    public static void Reverse (String str){
        String result="";
        for (int i =str.length()-1; i>=0; i--){
            result+=str.charAt(i);
        }
        System.out.println(result.toLowerCase(Locale.ROOT));
    }
    public static String ReverseStr (String str){
        String result1="";
        for (int i =str.length()-1; i>=0; i--){
            result1+=str.charAt(i);
        }
        return result1;
    }


}
