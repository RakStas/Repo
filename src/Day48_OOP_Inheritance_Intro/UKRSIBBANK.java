package Day48_OOP_Inheritance_Intro;

public class UKRSIBBANK {
    public  static String bankName;
    String firstName;
    String lastName;
    private String accountHolder;
    private double balance;
    private long accountNumber;

    public UKRSIBBANK( String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    static {
        bankName="UKRSIBBANK";
}

    public String getAccountHolder() {
        return accountHolder;
    }
    public double getBalance() {
        return balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void Deposit(double deposit){
        setBalance(balance+deposit);
    }

    public void WithDraw(double withDraw){

        if(withDraw<balance) {
            setBalance(balance - withDraw);

        }else
            System.out.println("Invalid Balance put some money");


    }

    public void availableBalance(){
        System.out.println("Your balance is $"+getBalance());
    }


    @Override
    public String toString() {
        return "Your bank is UKRSIBBANK" +
                "\nName " + firstName +
                "\nLast name " + lastName ;




    }
}
