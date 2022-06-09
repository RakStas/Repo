package Day51Expections.BrouserTask.BruwsersTask.PetsTask;

public class Tiger extends Pet{

    String size;

    public Tiger(String name, String breed, char gender, int age, String color, String size) {
        super(name, breed, gender, age, color);
        this.size=size;
    }
  @Override
    public void eat(){
        System.out.println(name+" eating meat");
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
