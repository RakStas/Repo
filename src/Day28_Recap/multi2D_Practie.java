package Day28_Recap;

public class multi2D_Practie {/*
task1:
                9 10 11 12 13
                4 5 6 7 8
                1 2 3

             task2:
                3 2 1
                8 7 6 5 4
                13 12 11 10 9

            task3:
                13 12 11 10 9
                8 7 6 5 4
                3 2 1*/
    public static void main(String[] args) {
        System.out.println("========================");
        int [][] num = {{1,2,3}, {4,5,6,7,8}, {9,10,11,12,13}};
        for (int i= num.length-1; i>=0;i--){
            int [] num1D=num[i];
            for (int j=0; j<=num1D.length-1; j++){
               int numD=num1D[j];
                System.out.print(numD+"  ");
            }System.out.println();
              }

        System.out.println("========================");

        for (int i= 0; i<= num.length-1;i++){
            int [] num1D=num[i];
            for (int j= num1D.length-1; j>=0; j--){
                int numD=num1D[j];
                System.out.print(numD+"  ");
            }System.out.println();
        }
        System.out.println("========================");
        for (int i= num.length-1; i>=0 ;i--){
            int [] num1D=num[i];
            for (int j=num1D.length-1 ; j>=0; j--){
                int numD=num1D[j];
                System.out.print(numD+"  ");
            }System.out.println();
        }
    }
}
