package Day51Expections.BrouserTask.BruwsersTask.ExceptionsIntro;

public class ExceptionsPractise {
    public static void main(String[] args) {


        System.out.println("Hello");
/*
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

        }
*/
        sleep(3);
        System.out.println("world");




        System.out.println("How are you?");
/*
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/sleep(5);
        System.out.println("Fine");


    }

    public static void sleep(int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
