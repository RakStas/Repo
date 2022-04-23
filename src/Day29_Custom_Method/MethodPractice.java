package Day29_Custom_Method;

public class MethodPractice {
    public static void main(String[] args) {
        oddNumbers();
        System.out.println("Pause");
        System.out.println("separate");
        evenNumbers();
    }

    public static void oddNumbers() {

        for (int i=1; i<=100; i+=2){
            System.out.print(i+" ");
        }
        System.out.println();


    }
    public static void evenNumbers(){
        for (int i=0; i<=100; i+=2){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
