package Day30_Custom_Method_Return_Method;

public class ReturnMethods2 {
    public static void main(String[] args) {
        //reStr1("Alina");   work also
        String name = "Lucky";
        reStr1(name);


        System.out.println(name.equalsIgnoreCase(reStr2(name)));
    }

    public static void reStr1(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        System.out.println(result);
    }

    public static String reStr2(String str2) {
        String result = "";
        for (int i = str2.length() - 1; i >= 0; i--) {
            result += str2.charAt(i);

        }


        return result;
    }
}
