package Day56_OOP_AbstractionContinueInterface.AnimalTask;

public class Snake extends Animal implements SwimAble{
    @Override
    public void sleep() {
        System.out.println("Snake is sleeping");
    }

    @Override
    public void eat() {
        System.out.println("Snake is eating");
    }

    @Override
    public void swim() {
        System.out.println("Snake is swimming");
    }
}
