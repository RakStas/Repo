package Day33_Method0OverloadingContinue;

import java.time.LocalDate;
import java.util.Scanner;

public class Dates {
    public static void main(String[] args) {
        LocalDate LD=LocalDate.of(2022, 4, 9);
        System.out.println(LD);

        LocalDate today = LocalDate.now();
        System.out.println(today);
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your birthday day");
        LocalDate b=LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt());
        //обовязково вводити РІК, МІСЯЦЬ, ДАТУ. Якщо вийти за рамки місяців 1-12 чи днів місяця 1-31, будe помилка
        System.out.println(b);
        System.out.println(b.isLeapYear());







    }
}
