package Day13_Scanner;

import java.util.Scanner;

public class Browsers {
    public static void main(String[] args) {
        Scanner brow = new Scanner(System.in);


        String browserName="fghj";
        switch(browserName){
            case "chrome":
                System.out.println("chrome");
                break;
            case "firefox":
                    System.out.println("firefox");
                    break;
            case "opera":
                System.out.println("opera");
                break;
            case "safari":
                System.out.println("safary");
                break;
            case "edge":
                System.out.println("edge");
                break;


        default:
                System.out.println("here is no this browsers "+ browserName);
        }



    }
}
