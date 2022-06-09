package Day48_OOP_Inheritance_Intro.Day48_OOP_Inheritance_Intro_Animal_Task;

public class DogTask extends AnimalTask{
    public void bark(){
        System.out.println(name+ " is barking");
    }

    public DogTask
            (String name, int wage, String size, String color,
    char gender, String breed) {

        SetMethod(name, wage, size, color, gender, breed);

    }
}
