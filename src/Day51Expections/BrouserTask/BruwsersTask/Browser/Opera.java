package Day51Expections.BrouserTask.BruwsersTask.Browser;

public class Opera extends WebDriver{
    public void get(String url){
        System.out.println("Opening the "+url+" in Opera browser");

    }
    public void close(){
        System.out.println("Closing the Opera browser");

    }

}
