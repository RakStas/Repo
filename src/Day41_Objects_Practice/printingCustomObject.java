package Day41_Objects_Practice;

public class printingCustomObject {
    public static void main(String[] args) {
        String str=new String("Stanislav");
        System.out.println(str);
        System.out.println(new String("School"));

        Carpet c1=new Carpet();

        c1.info(5, 5, 10, false);
        System.out.println(c1); //не коректно працює, видає хеш код, а не зачення


    }
}
