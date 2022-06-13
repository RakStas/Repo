package Day56_OOP_AbstractionContinueInterface.AnimalTask;

public class Turtle extends Animal implements SwimAble{
    @Override
    public void sleep() {
        System.out.println("Turtle is sleeping");
    }

    @Override
    public void eat() {
        System.out.println("Turtle is eating");
    }

    @Override
    public void swim() {
        System.out.println("Turtle is swimming");
    }
}
