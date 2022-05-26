package Day44_Constructor;

public class Dog_Practice_Constructor {
    String breed;
    char size;
    char gender;
    String name;

    public Dog_Practice_Constructor(String breed, char size, char gender, String name){
        this.breed=breed;
        this.size=size;
        this.gender=gender;
        this.name=name;
    }
    public String toString(){
        return "Dog name is "+name+
                "; size is "+size+
                "; gender is "+gender+
                "; breed is "+breed+";";    }
}
