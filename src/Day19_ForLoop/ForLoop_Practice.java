package Day19_ForLoop;

public class ForLoop_Practice {
    public static void main(String[] args) {
        System.out.println("Завдання №1");
        System.out.println("=============");
        for (int i=1; i<=100; i+=1){
            if(i%5==0&&i%3==0)
            System.out.print(i+" ");
        }
        //Даний варіант кращий, так як перед запуском програми, дава перевірить умови для запуску if
        for (int i=0; i<=100; i++) {
            if(i%2!=0) {
                if (i % 5==0 && i % 3==0);
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("Завдання №2");
        System.out.println("=============");
        for (int i=0; i<=100; i+=2) {
            if (i%5==0 && i%3==0){
                System.out.print(i+" ");}
            }
        System.out.println();
        System.out.println("=============");
        System.out.println("Завдання №3");


        for (int i=0; i<=100; i++){
            if (i%2==0){            //pre" Even number  парне число
                if (i%5==0 && i%3==0) { //число повинно ділитися на 3 та 5
                    System.out.print(i+" ");
                }
            }

        }








    }
}
