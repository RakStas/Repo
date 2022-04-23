package Day20_WhileLoop;

import java.util.Scanner;

public class WhileLoop3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String password="123";
        System.out.println("Password");

        String input=scan.nextLine();

        while (!input.equals(password)) {
            System.out.println("re-Input password");
            input=scan.nextLine();
        }
        System.out.println("Logged in");


    }
}
