package Day51Expections.BrouserTask.BruwsersTask.ExceptionsIntro;

public class ExceptionHandlings2 {
    public static void main(String[] args) {
        String exceptionResult="";
        try{
            System.out.println(10/0);
        }catch (ArithmeticException e){
           exceptionResult= e.getMessage();
            System.out.println("Ділити на 0 не можна");
        }
        System.out.println(exceptionResult);



    }


}
