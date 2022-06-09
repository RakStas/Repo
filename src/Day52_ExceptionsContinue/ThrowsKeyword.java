package Day52_ExceptionsContinue;

public class ThrowsKeyword {
    public static void method1(int second)throws InterruptedException{
        Thread.sleep(3000);
    }
    public static void method2(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("TryCatch");
        }

    }

    public static void main(String[] args) throws InterruptedException{
        method1(2000);
        method2();
    }
}
