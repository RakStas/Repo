package Day32_MetrhodOverLoading;

public class PracticeOverloadingAddition {
    public static void main(String[] args) {
        int f=10;
        int p= 15;
        addition(f, p);
    }
    public static void addition(int a, int b){
        System.out.println(a+b);
    }
    public static void addition(int a, int b, int c){
        System.out.println(a+b+c);
    }

    public static void addition(int a, int b, int c, int d){
        System.out.println(a+b+c+d);
    }

    public static void addition(int a, int b, int c, int d, int e){
        System.out.println(a+b+c+d+e);
    }

}
