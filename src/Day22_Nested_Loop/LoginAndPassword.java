package Day22_Nested_Loop;

import java.util.Scanner;
/*умови програми: заблокувати акаунт після введення паролю та логіну якщо було введено
три рази неправильно пароль та логін. Якщо правилььно, то авторизуватися
 */
public class LoginAndPassword {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String login = "qwe";
        String password = "qwe";
        int pas = 1;


        System.out.println("Введіть логін");
        String u = scan.nextLine();

        System.out.println("Введіть пароль");
        String p = scan.nextLine();

        while (!(u.equals(login) && p.equals(password))) {
            if (pas == 3) {
                System.out.println("Акаунт заблоковано");
                System.exit(0);
            }

            System.out.println("Не авторизовано, спробуйте ще раз");
            System.out.println("Спроба номер "+(pas+1));
            System.out.println("Введіть логін");
            u = scan.nextLine();
            System.out.println("Введіть пароль");
            p = scan.nextLine();
            pas++;

            }
        System.out.println("Success");
           }











    }

