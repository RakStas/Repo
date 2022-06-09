package Day48_OOP_Inheritance_Intro.Day48_OOP_Inheritance_Intro_Animal_Task;


        public class AnimalObjects {
    public static void main(String[] args) {

        DogTask dog1=new DogTask("Cot", 5, "M", "Black", 'M', "Mastiff");


        //variable
        System.out.println(dog1.name);
        System.out.println(dog1.size);
        System.out.println(dog1.wage);
        System.out.println(dog1.color);
        System.out.println(dog1.gender);
        //methods

        /*method from DogTask*/       dog1.bark();
        dog1.eat();
        dog1.sleep();
        System.out.println(dog1);
        Cat cat1=new Cat("Alisa", 2, "S", "Braun, ", 'F', "Usual cat");
        System.out.println(cat1);





    }


}
