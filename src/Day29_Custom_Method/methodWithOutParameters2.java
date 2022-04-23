package Day29_Custom_Method;

public class methodWithOutParameters2 {
    public static void main(String[] args) {
        printHello5x();
        System.out.println("Name");
        printHello5x();
        System.out.println("Dogs name");
        printHello5x();

    }
    public static void printHello5x(){

        for (int i=0; i<=4; i++) {

            System.out.print(" hello; ");
        }
        System.out.println();
            for (int i=0; i<=4; i++){

                System.out.print("School; ");

        }
        System.out.println();

    }
}
