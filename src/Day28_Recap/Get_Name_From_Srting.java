package Day28_Recap;

public class Get_Name_From_Srting {
    public static void main(String[] args) {
        String mail = "Cyberek@gmail.com";
        String name = mail.substring(0, mail.indexOf("@"));
        String dom = mail.substring(mail.indexOf("@")+1, mail.indexOf("."));
        System.out.println("Name: "+name);
        System.out.println("Domain: "+dom);











    }
}
