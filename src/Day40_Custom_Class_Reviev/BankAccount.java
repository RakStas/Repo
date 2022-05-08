package Day40_Custom_Class_Reviev;

import java.util.Scanner;

public class BankAccount {
    /*BankAccount
        attributes/data that can have are:
                1. AccountHolder, 2. AccountNumber, 3. Balance 4. AccountType

      	Actions:
      		1. CheckBalance,   2. deposit,  3. withdraw


          requiremnts:
            1. user should be able to deposit money into their account
            2. user should be able to withdraw money from their account
                2.1 if the withdrawing account is greater than available balance, 35$ penalty charge will be added
                2.2 if the balance is less than or equal to 0, user should not be able to withdraw money
            3. user should be able to see their balance
*/

    String AccountHolder;
    String AccountType;
    int AccountNumber;
    int Balance;


    public void putDeposit(String AccountNameHolder, int putMoney, int AccNumber, String AccType ){
        AccountHolder=AccountNameHolder;
        AccountNumber=AccNumber;
        AccountType=AccType;
        Balance=putMoney;
    }
    public void CheckBalance(){
        System.out.println("Name of owner in Bank: "+AccountHolder);
        System.out.println("Your balance is "+AccountType+" "+Balance);
        System.out.println();
    }
    public void deposite(){
        System.out.println("Enter how much you want to put in your bank account?");
        Scanner scan = new Scanner(System.in);
        int singlePay=scan.nextInt();
        Balance+=singlePay;

        System.out.println("Thank you for using our bank! Now you have $"+Balance);
    }
    public void withDraw(){
        System.out.println("How much money you want to get from your Bank?");
        Scanner withDraw=new Scanner(System.in);
        int getMoney=withDraw.nextInt();
        int result=Balance-getMoney;
        if(result>=35){
            Balance=result;
            }
        else {
            System.out.println("Your balance is ery low, please put some money");
        }
        System.out.println("Thank you for using our bank! You have $"+Balance);
    }
}
