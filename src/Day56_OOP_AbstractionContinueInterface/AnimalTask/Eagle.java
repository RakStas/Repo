package Day56_OOP_AbstractionContinueInterface.AnimalTask;

public class Eagle extends Animal implements FlyAble{
    @Override
    public void sleep() {
        System.out.println("Eagle is sleeping");
    }

    @Override
    public void eat() {
        System.out.println("Eagle is eating");
    }

    @Override
    public void Fly() {
        System.out.println("Eagle is flying");
    }
}
