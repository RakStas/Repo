package Day51Expections.BrouserTask.BruwsersTask.SuperClass;
class Test{
    int a=10;
    public void method (){
        System.out.println("Holla");
    }
}

public class SuperKey extends Test{

    public void print1(){
        System.out.println(this.a);
    }

    public void print2(){
        System.out.println(super.a);
        System.out.println();}


    public static void main(String[] args) {
        Test test1=new Test();
        Test test2=new Test();
                test1.method();
        System.out.println(test2.a);
    }
        }

