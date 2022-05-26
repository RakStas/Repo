package Day44_Constructor;

public class DogList {
    public static void main(String[] args) {
        Dog_Practice_Constructor dog1=new Dog_Practice_Constructor("JeckRussel", 'M', 'F', "Lucky");
        Dog_Practice_Constructor dog2=new Dog_Practice_Constructor("Foxterier", 'S', 'M', "Gray");
        Dog_Practice_Constructor dog3=new Dog_Practice_Constructor("GermanyDog", 'L', 'F', "Almazz");
        Dog_Practice_Constructor dog4=new Dog_Practice_Constructor("IsraelDog", 'S', 'M', "Iziya");
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog4);

    }
}
