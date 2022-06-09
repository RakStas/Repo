package Day48_OOP_Inheritance_Intro;

public class UserBankAccount {
    public static void main(String[] args) {
        UKRSIBBANK client1=new UKRSIBBANK("Alina", "Rak"  );
        client1.setBalance(150);
        client1.setAccountHolder("Alina Rachok");
        client1.setAccountNumber(979754266);

        System.out.println("Dear "+client1.firstName+" "+client1.lastName+", your bank is "+client1.bankName);
        System.out.println("Dear "+client1.firstName+" "+client1.lastName+", balance is $"+client1.getBalance());
        System.out.println("Dear "+client1.firstName+" "+client1.lastName+", Account Number is "+client1.getAccountNumber());
        System.out.println("Dear "+client1.firstName+" "+client1.lastName+", Account Holder: "+client1.getAccountHolder());

        System.out.println("==============");
        client1.Deposit(50);
        System.out.println(client1.getBalance());
        client1.WithDraw(20);
        client1.availableBalance();
    }
}
