package Day19_ForLoop;

public class ForLoopCharacters {
    public static void main(String[] args) {



        System.out.println();
        System.out.println("=============");
        System.out.println("Завдання №1, написати англійський алфавіт від a to z");
        for (char i='a'; i<='z' ; i+=1) {
            System.out.print(i+" ");


        }

        System.out.println();
        //for (char i=97; i<=122; i++)
        for (int i=65; i<=90; i++) {
            char ch=(char)i;
            System.out.print(ch+" ");
        }
        System.out.println();
        for (int i=90; i>=65; i--) {
            char ch=(char)i;
            System.out.print(ch+" ");
        }

    }
}
