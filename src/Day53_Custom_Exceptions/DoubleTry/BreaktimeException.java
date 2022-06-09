package Day53_Custom_Exceptions.DoubleTry;

public class BreaktimeException extends RuntimeException{ //uncheckException

        public BreaktimeException(String str) {
          super(str);

            System.out.println("I am on the top");
        }


}
class A{

    public static void main(String[] args) {

        //throw new RuntimeException("Pass argument");
        throw new BreaktimeException("Fail arguments");

    }

}