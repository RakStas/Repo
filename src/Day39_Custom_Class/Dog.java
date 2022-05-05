package Day39_Custom_Class;

public class Dog {
    String breed;
    String color;
    String size;
    int age;

public void setDogInfo(String dogBreed, String dogColor, String dogSize, int dogAge){
    breed=dogBreed;
    color=dogColor;
    size=dogSize;
    age=dogAge;

}
public void getDogInfo(){
    System.out.println("The breed is "+breed+" and color is "+
            color+". Size is "+size+". Dog is "+age+" years old");
}
    public void eat(){
        System.out.println(color+" "+breed+" like eat "+color+" cheese ");
    }

}
