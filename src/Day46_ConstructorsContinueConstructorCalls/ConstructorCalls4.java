package Day46_ConstructorsContinueConstructorCalls;

public class ConstructorCalls4 {
    public ConstructorCalls4(){
        System.out.println("first call");
    }
    public ConstructorCalls4(int v){
        this(2.5);
        System.out.println("second Call");
    }
    public ConstructorCalls4(double a){
        this();
        System.out.println("third Call");
    }

    public static void main(String[] args) {
        new ConstructorCalls4(2.5);
    }
}
