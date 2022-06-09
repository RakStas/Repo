package Day53_Custom_Exceptions;

public class Break_timeException extends RuntimeException {

      /*  public Break_timeException(){
           super("its time for break");
            System.err.println("Short break");
        }*/
        public Break_timeException(String str){
            super(str);
            System.out.println("take 15 minutes break");
        }
}

    class Test{
        public static void main(String[] args) {

            throw new  Break_timeException("");
          //throw new RuntimeException("new Runtime exception ");



        }
    }

