package Day20_WhileLoop;

public class BranchingStatement {
    public static void main(String[] args) {
        char ch='A';
        while (ch<='I'){
            if(ch=='C'||ch=='A'){
                ch++;
                continue; //пропустить все що після вказаного в умові, так що дію
                          // яку потрібно виконати потрібно писати перед контінію
            }
            System.out.print(ch+" ");
            ch++;
        }
        System.out.println("+++++++++++++++++++++++");
        System.out.println("Task2");
    boolean a=true;
        while(a){

        System.out.println("test stares");
        //break;
        System.exit(0);//stops the entire program
            System.out.println("Completed");
    }








    }
}
