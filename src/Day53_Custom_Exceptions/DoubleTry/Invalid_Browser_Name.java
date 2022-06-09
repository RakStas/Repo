package Day53_Custom_Exceptions.DoubleTry;

import java.util.Locale;
import java.util.Scanner;

public class Invalid_Browser_Name extends RuntimeException{

    public Invalid_Browser_Name(String str){
        super(str);
    }


}
class Test2{

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String name= scan.next();

        switch (name){
            case "opera":
                System.out.println("opera selected");
                break;
            case "safari":
                System.out.println("safari selected");
                break;
            case "chrome":
                System.out.println("chrome is selected");
                break;
            default: throw new Invalid_Browser_Name("make correct choice! "+" "+name.toUpperCase(Locale.ROOT)+" is not correct browser");
        }


    }
}