package Day23Arrays;

public class minMaxArr {
    public static void main(String[] args) {
        int [] num = {10,20, 3,4,5,6,7,-10,-100, 300, 400};
       int max = -2147483648;
       // int max=2147483647;

       // int max=num [0];

            for (int i=0;  i<= num.length-1; i++){
                if (num[i]>=max){
                    max=num[i];
                }
                }
        System.out.println(max);


            }
        }





