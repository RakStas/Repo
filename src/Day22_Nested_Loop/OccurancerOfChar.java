package Day22_Nested_Loop;

/*програма яка показує кількість одної букви яку ти вводиш в рядок.
сканує ввессь текст та виводить число з пошуку кількості одної букви*/
import java.util.Scanner;

public class OccurancerOfChar {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Write string");

        String str=scan.nextLine();
        System.out.println("enter what you want find");
        char ch=scan.next().charAt(0);
        int num=0;
       /* Перший метод

        for (int i=0; i<=str.length()-1;i++)
        {char each=str.charAt(i); //
            if (each==ch){

                num++;

            }

        }

        Другий метод з використання while          */
        int index =0;
        while (index<=str.length()-1){
            char each=str.charAt(index); //
            if (each==ch) {

                num++;
            }
            index++;
        }
        System.out.print(num+" times it were wrote");





    }
}
