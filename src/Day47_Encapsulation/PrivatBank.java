package Day47_Encapsulation;

public class PrivatBank {

    String firstName;
    String lastName;
    int age;
    String job;

    private String ID;
    private String adress;

    public PrivatBank(String firstName, String lastName, int age, String job) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.job = job;
    }
    public static String CompanyName="Nasha Ryaba";


    public String getID(){
        return ID;
    }
    public String getAdress(){
        return adress;
    }
    public void SetID(String ID)
    {
        this.ID=ID;
    }
    public void SetAdress(String adress)
    {
        this.adress=adress;
    }

    @Override
    public String toString() {
        return "PrivatBank: " +
                "\nFirstName " + firstName +
                "\nLastName " + lastName +
                "\nAge " + age +
                "\nJob " + job;
    }
}
