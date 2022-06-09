package Day48_OOP_Inheritance_Intro.Day48_OOP_Inheritance_Intro_Animal_Task;

public class AnimalTask {
    public String name;
    public int wage;
    public String size;
    public String color;
    public char gender;
    public String breed;
    public void eat(){
        System.out.println(name+" is eating");
    }
    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    public void SetMethod(String name, int wage, String size, String color,
                          char gender, String breed ){
        this.name=name;
        this.wage=wage;
        this.size=size;
        this.color=color;
        this.gender=gender;
        this.breed=breed;
    }

    @Override
    public String toString() {
        return "AnimalTask: " + "Name = " + name + ", wage = " + wage +
                ", size = " + size+ ", color = " + color +
                ", gender = " + gender+
                ", breed = " + breed;
    }
}
