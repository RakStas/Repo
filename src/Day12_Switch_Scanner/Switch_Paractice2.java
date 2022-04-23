package Day12_Switch_Scanner;

import javax.sound.midi.Soundbank;

public class Switch_Paractice2 {
    public static void main(String[] args) {

        String productName="iPhone";
        switch (productName){
            case "galaxy":
                System.out.println("Samsung");
                break;
            case "iphone":
            case "macBook":
                System.out.println("Apple");
                break;


            default:
                System.out.println("err");
        }


    }
}
