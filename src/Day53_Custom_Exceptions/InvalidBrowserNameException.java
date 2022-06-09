package Day53_Custom_Exceptions;

public class InvalidBrowserNameException extends RuntimeException{

    public InvalidBrowserNameException(String str){
        super(str);
    }

}
class  Test2{
    public static void main(String[] args) {
        String name="chrome";

        switch (name){
            case "safari":
                System.out.println("Chrome is selected");
                break;
            case "opera":
                System.out.println("opera is selected");
                break;
            case "fireFox":
                System.out.println("firefox is selected");
                break;
            default: throw new InvalidBrowserNameException("My name is Stas. I live in Denmark ");
        }

        //throw new InvalidBrowserNameException();
    }
}