package Day58_OOP_Polymorphism_Continue;

import Day57_OOP_Polymorphism.WarmTask.Iphone;
import Day57_OOP_Polymorphism.WarmTask.Phone;
import Day57_OOP_Polymorphism.WarmTask.Samsung;
import Day58_OOP_Polymorphism_Continue.WarmTask.Animal;
import Day58_OOP_Polymorphism_Continue.WarmTask.Cat;
import Day58_OOP_Polymorphism_Continue.WarmTask.Dog;

public class TypeCasting {

    public static void main(String[] args) {

        Dog dog=new Dog("alla", 85, 'B' );
        Cat cat=new Cat("Yana", 55, 'F');
        Animal animal=new Animal(11, 'F');

        Animal animalDog=dog;
        Animal an1malCat=cat;

        //Cat animalcat= (Cat) animal; compile err|| here no isRelation between methods

        Iphone phone1=new Iphone("Iphone", "11", 11, "11");
        Phone phone2=phone1;

        Phone phone3=new Samsung("Samsung", "s20", 11, "11");
        Samsung phone4=(Samsung)phone3;

















    }



}
