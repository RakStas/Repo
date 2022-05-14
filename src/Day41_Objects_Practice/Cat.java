package Day41_Objects_Practice;

public class Cat {

    String color;
    int age;
    char gender;
    String Name;
    String breed;


    public void infoCat(String color, int age,char gender, String Name,String breed){

        this.color=color;
        this.age=age;
        this.gender=gender;
        this.Name=Name;
        this.breed=breed;
    }

    public String toString(){
        return "My Cat has name "+Name+"\nIt is "+breed+" type"+"\nIt is "
        +age+" Cat Color is "+color+"\nCat is "+gender;

    }
    public void eat(String catFood){
        System.out.println(Name+" cat eat meat and vegetables "+catFood);
    }
    public void drink(String catWater){
        System.out.println(Name+" cat drink water and beer"+catWater);
    }

}

