package Day58_OOP_Polymorphism_Continue.WarmTask;

public class Dog extends Animal{
    public String dogName;


    public Dog(String dogName, int age, char gender) {
        super(age, gender);
        this.dogName=dogName;
    }

    public void bark(){
        System.out.println("Dog "+dogName+" is making voice");

    }
    @Override
    public void eat(){
        System.out.println("Dog "+dogName+" is eating");
    }

    public void sleep(){
        System.out.println("Dog "+dogName+" is sleeping");
    }



    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", gender=" + gender +
                ", dogName='" + dogName + '\'' +
                '}';
    }
}
