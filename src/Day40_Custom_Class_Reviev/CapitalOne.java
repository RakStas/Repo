package Day40_Custom_Class_Reviev;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {
    public static void main(String[] args) {
        BankAccount Stas=new BankAccount();
        BankAccount Viv=new BankAccount();
        BankAccount QQQQ =new BankAccount();

        Stas.putDeposit("Stanislav", 1205, 16965,  "USD");
        Viv.putDeposit("Valeriy", 1255, 475485,  "EU");
        QQQQ.putDeposit("Olga", 57805, 7414141,  "UHR");

        ArrayList<BankAccount>list=new ArrayList<>();
        list.addAll(Arrays.asList(Stas, Viv, QQQQ));

        for(BankAccount each: list){
            each.CheckBalance();
        }

}
}