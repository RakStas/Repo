package Day19_ForLoop;

public class ContinueStatement {
    public static void main(String[] args) {
        System.out.println("Завдання №1. ''Continue''"); //Копілятор пропускає цифру яка вказана в иф
        for(int i=1; i<=5; i++){
            if (i==3){
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Завдання №2");
                for(char ch='A'; ch<='F'; ch++){ //пропустить букву С та F, якi вказана в if ==> A B D E
                    if(ch=='C'||ch=='F'){
                        continue;
                    }
                    System.out.print(ch+" ");
                }
        System.out.println();
        System.out.println("Завдання №3.");







    }
}
