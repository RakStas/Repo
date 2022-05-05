package Day39_Custom_Class;

public class DogInfoAndActions {
    public static void main(String[] args) {
        Dog dog1=new Dog();
        dog1.setDogInfo("Spaniel", "black", "middle", 3);
        dog1.eat();
        dog1.getDogInfo();
        System.out.println("-------------------");
        Dog dog2=new Dog();
        dog2.setDogInfo("Jack Russel Terrier", "Black and white",
                "Small", 4);
        dog2.getDogInfo();
        dog2.eat();
    }
}
