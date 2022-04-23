package Day21Loops;
/*ex:
                input:  10
                        3
                0utput: 3 with a remainder of 1
               10/3 = 3
               10 - 3 = 7
               7 - 3 = 4;
               4 - 3 = 1
*/
public class DivideTwoNumbers {
    public static void main(String[] args) {
        int a=10;
        int b=3;

        int count=0;

        while (a>b){

            a-=b;
            count++;
        }
    }
}
