package Day52_ExceptionsContinue;

public class ThrowsPractice {
    public static void main(String[] args) {
        String driverName="name";

        if (driverName.equals("chrome")){
            System.out.println("Set up chrome");
        }else if(driverName.equals("opera")){
            System.out.println("Set up opera");

        }else if(driverName.equals("firefox")){
            System.out.println("Set up firefox");

        }else{
            throw new RuntimeException("wrong browser name");
        }
    }

}
