package Day51Expections.BrouserTask.BruwsersTask.ExceptionsIntro;

public class ExceptionHandling {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        String exceptionMessage="";
       try {
           System.out.println(arr[4]);
       }catch (IndexOutOfBoundsException e){
           exceptionMessage=e.getMessage();
       }
        System.out.println("Next step");
        System.out.println(exceptionMessage);
    }

}
