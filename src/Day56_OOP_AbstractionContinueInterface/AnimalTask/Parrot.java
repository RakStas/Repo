package Day56_OOP_AbstractionContinueInterface.AnimalTask;

public class Parrot extends Animal implements FlyAble, PlayAble, TalkativeAble{


    @Override
    public void sleep() {
        System.out.println("Parrot is sleeping");
    }

    @Override
    public void eat() {
        System.out.println("Parrot is eating");
    }

    @Override
    public void Fly() {
        System.out.println("Parrot is flying");
    }

    @Override
    public void play() {
        System.out.println("Parrot is playing");
    }

    @Override
    public void Talk() {
        System.out.println("Parrot is talking");
    }
}
