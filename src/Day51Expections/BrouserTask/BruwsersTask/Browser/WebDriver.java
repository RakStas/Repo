package Day51Expections.BrouserTask.BruwsersTask.Browser;

public class WebDriver {
    String apl;
    public void get(String url){
        System.out.println("Opening the "+url+" In default browser");

    }
    public void close(){
        System.out.println("Closing the default browser");
    }
}
