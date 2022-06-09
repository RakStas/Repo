package Day51Expections.BrouserTask.BruwsersTask.Browser;

public class BrowserObject {
    public static void main(String[] args) {
        ChromeBrowser chrome=new ChromeBrowser();
        chrome.get("www.google.com");
        chrome.close();

        FireFox fireFox=new FireFox();
        fireFox.get("www.facebook.com");
        fireFox.close();


    }
}
