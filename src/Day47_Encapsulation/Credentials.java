package Day47_Encapsulation;

public class Credentials {
    public String name;
    public  int age;
    private String username;
    private String password;

    public static String companyName;
    static {
        companyName="Facebook";
    }

    public Credentials(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String getUserName(){
      return username;
    }
   public String getUserPassword(){
        return password;
   }
   public void SetUserName(String username){
        this.username=username;
   }
   public void SetUserPassword(String  password){
        this.password=password;
   }

}
