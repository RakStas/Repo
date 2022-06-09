package Day51Expections.BrouserTask.BruwsersTask.PetsTask;

public class Pet {
    public String name;
    public String breed;
    public char gender;
    public int age;
    public String color;

    public Pet(String name, String breed, char gender, int age,
                                                String color){
        this.name=name;
        this.breed=breed;
        this.gender=gender;
        this.age=age;
        this.color=color;
    }

    public void eat(){
        System.out.println(name+ " eating chocolate");
    }
    public void drink(){
        System.out.println(name+ " drinking");
    }
    public void sleep(){
        System.out.println(name + " sleeping");
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name " + name +
                "\nbreed='" + breed +
                "\ngender=" + gender +
                "\nage=" + age +
                "\ncolor='" + color;
    }
}
