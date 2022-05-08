package Day40_Custom_Class_Reviev;

public class SingleAccountBank {
    public static void main(String[] args) {
        BankAccount newUser=new BankAccount();
        newUser.putDeposit("Rak Stanislav", 9990, 19620, "USD");
        newUser.CheckBalance();
        newUser.deposite();
        newUser.withDraw();

    }

}
