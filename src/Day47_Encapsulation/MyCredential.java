package Day47_Encapsulation;

public class MyCredential {
    public static void main(String[] args) {
        Credentials obj1=new Credentials("Alina", 25);
        obj1.SetUserName("AlinaRak");
        obj1.SetUserPassword("301196");

        System.out.println( obj1.getUserName());
        System.out.println(obj1.age);
        System.out.println(obj1.name);
        System.out.println(obj1.companyName);




    }
}
