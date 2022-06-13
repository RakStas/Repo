package Day56_OOP_AbstractionContinueInterface.AnimalTask;

public class Cat extends Animal implements PlayAble{

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }


    @Override
    public void play() {
        System.out.println("Cat is playing");
    }
}
