package Day30_Custom_Method_Return_Method;

public class ReturnMethod {
    public static void main(String[] args) {
        add(5,4);
        int sum =(addition(10, 15)*3); //там де було ненаписано войд, написали інт,
                                             // що змінює значення методу. обовязково писати ретурн!!!
        System.out.println(sum);
    }
    public static void add (int a, int b){
        int sum=a+b;
        System.out.println(sum);
    }
public static int addition (int a, int b){
        int sum =a+b;

    return sum;
}



}
