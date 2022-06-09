package Day47_Encapsulation;

public class AccessModifiers {



    //public викоритовується де завгодно,
    //                   відкрита форма для використання
        public static int publicVariable=100;
        public static void publicMethod(){
        System.out.println("Public Method");
        }

    //default. Можна викоритовувати тільки в даному пекеджі
        static int defaultVariable=200;

        static void defaultMethod(){
        System.out.println("Default Method");
        }

    //private можна викоритовувати тільки в цьому класі
        private  static int privateVariable =300;
        private  static void privateMethod(){
        System.out.println("Private Method");
        }

    public static void main(String[] args) {
        privateMethod();
        defaultMethod();
        privateMethod();

        System.out.println(publicVariable);
        System.out.println(defaultVariable);
        System.out.println(privateVariable);
    }

}
