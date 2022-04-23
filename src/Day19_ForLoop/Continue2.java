package Day19_ForLoop;

public class Continue2 {
    public static void main(String[] args) {
        for (int i =1; i<=50; i+=1){
            if(i%2!=0){
                if(i==1||i==49)
                {continue;
                }
                System.out.print(i+" ");

            }

        }
    }

}
