package Day19_ForLoop;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Завдання 1. Написану стрічку написати з кінця до початку");
        String str="Станіслав мечем бє по Аліні";
       //           01234
      // String result=""+str.charAt(str.length()-1)+str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0);
        System.out.println("");

        String result = "";

        for (int i=(str.length()-1); i>=0; i--){
            result +=str.charAt(i);
        }

        System.out.println(result);







    }
}
