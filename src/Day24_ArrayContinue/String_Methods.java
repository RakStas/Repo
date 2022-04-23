package Day24_ArrayContinue;
    import java.util.Arrays;
public class String_Methods {
    public static void main(String[] args) {
        String str="ABCD";
        char [] ch=str.toCharArray(); //переводить стрінг в чар метод

        System.out.println( Arrays.toString(ch));

        System.out.println("=======================");
        String str1="DCEBA";
        String str2="ADCBE";


        char ch1[]=str1.toCharArray();
        char ch2[]=str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean bo1=Arrays.equals(ch1, ch2);
        System.out.println(bo1);
        System.out.println("==========================");
        String sentence = "I love programing language";
        //Language programing love I

        String[] words=sentence.split(" ");

        System.out.println(Arrays.toString(words) );
        for(int i =words.length-1; i>=0; i-- ){
            System.out.print(words[i]+" ");
        }
        System.out.println();
        System.out.println("==========================");


        String s="JAVA";
        String []sp =s.split(" ");
        System.out.println(Arrays.toString(sp));

        char []c = s.toCharArray();
        System.out.println(Arrays.toString(c));


        











    }
}
