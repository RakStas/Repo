package Day31_Recap;

public class Method_Practice {
    public static void main(String[] args) {
       int maxNum= Max(24,34);
        System.out.println(maxNum);
    }
    public static void max(int a, int b) {
        if (a > b) {
            System.out.println(a + " is bigger number");
        } else if (b > a) {
            System.out.println(b + " is bigger num");
        } else {
            System.out.println("numbers is equal");
        }
    }

    public static int Max(int a, int b) {
        int max = a > b ? a : b;

        return max;
    }
}