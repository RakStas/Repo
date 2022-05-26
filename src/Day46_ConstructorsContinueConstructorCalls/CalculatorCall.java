package Day46_ConstructorsContinueConstructorCalls;

public class CalculatorCall {

    public CalculatorCall(){
        System.out.println("A");
    }
    public CalculatorCall(int a){
            this();
        System.out.println("B");

    }
           public CalculatorCall(String b){
        this(4);
               System.out.println("C");
           }
           public CalculatorCall(char q){
        this();
               System.out.println("D");
           }
    public static void main(String[] args) {

        new CalculatorCall('F')  ;


    }



}
