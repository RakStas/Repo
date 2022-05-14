package Day41_Objects_Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class CatObject {
    public static void main(String[] args) {
      Cat cat1=new Cat();
      Cat cat2=new Cat();
      Cat cat3=new Cat();
      Cat cat4=new Cat();
        int count=1;
      ArrayList<Cat> list=new ArrayList<>();
      list.addAll(Arrays.asList(cat1, cat2, cat3, cat4      ));
        cat1.infoCat("Black", 1, 'M', "Kot", "Usual");
        cat2.infoCat("White", 2, 'F', "Alisa", "Table");
        cat3.infoCat("Braun", 3, 'F', "Murka", "Persian");
        cat4.infoCat("Yellow", 4, 'M', "Pshonka", "Usual");

      Cat[] catPark={new Cat(),new Cat(),new Cat(),new Cat()};
        catPark[0].infoCat("Black", 5, 'F', "Shmonka", "Usual");
        catPark[1].infoCat("Grey", 6, 'F', "Valeriya", "Usual");
        catPark[2].infoCat("White", 7, 'M', "Koteiko", "Usual");
        catPark[3].infoCat("White and black", 8, 'M', "Puska", "Usual");


      /*  for(Cat each: catPark){
            System.out.println(each);
        }*/

        ArrayList<Cat>femaleCat=new ArrayList<>();
        ArrayList<Cat>maleCat=new ArrayList<>();

        for(int i=0; i<=catPark.length-1; i++){
            if(catPark[i].gender=='M'){
                count++;
                maleCat.add(catPark[i]);
                }else {
                femaleCat.add(catPark[i]);
            }
        }

        System.out.println(femaleCat);


    }
}
