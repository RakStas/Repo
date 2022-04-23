package Day23Arrays;

import java.util.Locale;
import java.util.Scanner;

/*write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

            the program asks the user which bedroom does he/she wants to reserve
            and calculates the total price, and then the program will ask:
                do you want to reserve another room:
                            if yes ==> repeat the previous steps
                            if no ==> your total price is: $$$
                            while answer is neither yes or no ==> please re-enter

            HINT: nested loop task, outter loop need to be an infinite loop*/
public class CybertekInn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = 0;
        System.out.println("Вітаємо в готелі");
        while (true) {

            System.out.println("Зробіть ваш вибір");

            System.out.println("1. King room 120$");
            System.out.println("2. Queen room 100$");
            System.out.println("3. Single room 80$");
            System.out.println();
            System.out.println("Будь ласка, зробіть ваш вибір");
            int option = scan.nextInt();

            switch (option) {
                case 1:
                    total += 120;
                    break;
                case 2:
                    total += 100;
                    break;
                case 3:
                    total += 80;
                    break;
            }


            System.out.println("Чи бажаєте ви ще взяти номер?");
            String answer = scan.next().toLowerCase(Locale.ROOT);
            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.out.println("Будь ласка, введіть коректно, Yes або No");
                System.out.println("Чи бажаєте вибрати ще кімнату?");
                answer = scan.next().toLowerCase();
            }

            if (answer.equals("no")) {
                break;
            }
        }
        System.out.println("Ціна за номер $" + total);
    }
        }









