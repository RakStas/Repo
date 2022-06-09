package Day47_Encapsulation;

public class ClientPrivateBank {
    public static void main(String[] args) {
        PrivatBank client1=new PrivatBank("Alina", "Rak", 25, "Mom");


        client1.SetID("19620");
        client1.SetAdress("Budishche 77");

        System.out.println(client1);
        System.out.println("your ID: "+client1.getID());
        System.out.println("Your address: "+client1.getAdress());
        System.out.println("Company where you work: "+client1.CompanyName);


    }
}
