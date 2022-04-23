package Day29_Custom_Method;

public class Reverse_String {
    public static void main(String[] args) {
        reverse("Rak Stanislav");
        reverse("Kolia");
    }
    public static void reverse(String str){
        String result= "";
        for (int i = str.length()-1; i>=0 ; i--) {
            result+=str.charAt(i);

        }
        System.out.println(result);






    }
}
