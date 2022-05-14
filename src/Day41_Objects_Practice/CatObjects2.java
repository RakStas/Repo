package Day41_Objects_Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class CatObjects2 {
    public static void main(String[] args) {



        Cat[] catPark={new Cat(),new Cat(),new Cat(),new Cat(), new Cat()};
        catPark[0].infoCat("Black", 5, 'F', "Shmonka", "Usual");
        catPark[1].infoCat("Grey", 6, 'F', "Valeriya", "Usual");
        catPark[2].infoCat("White", 7, 'M', "Koteiko", "Usual");
        catPark[3].infoCat("White and black", 8, 'M', "Pusichka", "Usual");
        catPark[4].infoCat("White and black", 8, 'M', "Pusichka", "Usual");
        ArrayList<Cat>maleCat=new ArrayList<>();
        maleCat.addAll(Arrays.asList(catPark));
        maleCat.removeIf(p->p.gender!='M');

        ArrayList<Cat>femaleCat=new ArrayList<>();
        femaleCat.addAll(Arrays.asList(catPark));
        femaleCat.removeIf(p->p.gender=='M');

        System.out.println("Male cat "+ maleCat.size());
        System.out.println("===============");
        System.out.println("Female cat  "+femaleCat.size());
    }

}
