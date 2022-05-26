package Day46_ConstructorsContinueConstructorCalls;

public class ConstructorCalls3 {
        public ConstructorCalls3(){
            System.out.println("A");
        }

        public ConstructorCalls3(int a){
            System.out.println("B");
        }

        public ConstructorCalls3(char v){
            this(10);
            System.out.println('X');
        }
    public static void main(String[] args) {
            new ConstructorCalls3();

        System.out.println("=====");

            new ConstructorCalls3(10);

        System.out.println("=====");

            new ConstructorCalls3('F');
    }
}
