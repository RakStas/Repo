package Day51Expections.BrouserTask.BruwsersTask.PetsTask;

public class Cat extends Pet{
    double price;
    public Cat(String name, String breed, char gender, int age, String color, double price) {
        super(name, breed, gender, age, color);
        this.price=price;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

}
