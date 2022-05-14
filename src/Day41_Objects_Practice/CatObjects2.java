package Day41_Objects_Practice;

import java.util.ArrayList;

public class CatObjects2 {
    public static void main(String[] args) {

        ArrayList<Cat>catList=new ArrayList<>();
        Cat[] catPark={new Cat(),new Cat(),new Cat(),new Cat()};
        catPark[0].infoCat("Black", 5, 'F', "Shmonka", "Usual");
        catPark[1].infoCat("Grey", 6, 'F', "Valeriya", "Usual");
        catPark[2].infoCat("White", 7, 'M', "Koteiko", "Usual");
        catPark[3].infoCat("White and black", 8, 'M', "Pusichka", "Usual");




    }

}
