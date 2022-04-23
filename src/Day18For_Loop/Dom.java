package Day18For_Loop;

import java.util.Scanner;

public class Dom {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String email= scan.next();
        int index1=email.indexOf("@");
        int index2=email.lastIndexOf(".");
        String dom = email.substring(index1+1, index2);

        System.out.println("Your DOM is: "+dom);



    }
}
