package Day17_String_Review_Recap;

public class Pool_VS_Heap {
    public static void main(String[] args) {
        String s1="Cybertek";//String pool як приватний басейн, де тільки свої, і їх легше знайти
        String s2="Cybertek";//String pool
        String s3=new String("Cybertek"); //heap, як океан з великим пляжем і тут багато персон
        String s4=new String("Cybertek");
        System.out.println(s1==s2); //true
        System.out.println(s1==s3);//false
        System.out.println(s3==s4);//false








    }
}
