package Day52_ExceptionsContinue;

public class main {
    public static void main(String[] args) {


        try {
            System.out.println(10/0);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }



    }
}
