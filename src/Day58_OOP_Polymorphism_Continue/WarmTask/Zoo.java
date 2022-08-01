package Day58_OOP_Polymorphism_Continue.WarmTask;

public class Zoo {
    public static void main(String[] args) {
        Animal dog1=new Dog("Ada", 5, 'F');
        Animal cat1=new Cat("Alisa", 15, 'F');

        dog1.eat();
        dog1.sleep();
        //dog1.bark();
    }



}
