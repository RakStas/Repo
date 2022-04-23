package Day24_ArrayContinue;

public class Uniques2 {
    public static void main(String[] args) {

        String str = "aabcc";
        String uniq = "";
        for (int j = 0; j<=str.length()-1; j++) { //запускає програму разом із лічильником рівно
            char ch1 = str.charAt(j);               //  стільки раз, скільки символів введенов рядок стрінг
            int count = 0;
            for (int i = 0; i <= str.length() - 1; i++) { //запускає перевіряти вказану букву з ішими
                char ch2 = str.charAt(i); // a  a  b  c  c
                if (ch1 == ch2) {
                    count += 1;
                }
            }
            if(count==1){
                uniq+=ch1;
            }
        }
        System.out.println(uniq);
    }
}
