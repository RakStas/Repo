package Day41_Objects_Practice;

import Day41_Objects_Practice.Carpet;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetsObjects {
    public static void main(String[] args) {

       /* Carpet carpet1=new Carpet();
        Carpet carpet2=new Carpet();
        Carpet carpet3=new Carpet();
        Carpet carpet4=new Carpet();
        Carpet carpet5=new Carpet();
        ArrayList<Carpet>carpets=new ArrayList<>();
        carpets.addAll(Arrays.asList(carpet1,carpet2,carpet3,carpet4 ));*/
        Carpet[] carpets={new Carpet(),new Carpet(),new Carpet(),new Carpet(),new Carpet(),};

        carpets[0].info(4,6,200, true);
        carpets[1].info(8,7,6000, false);
        carpets[2].info(20,15,2100, true);
        carpets[3].info(2,14,1200, false);
        carpets[4].info(24,5,210, true);
        for (Carpet each:carpets){
            each.GetInfo();
        }
        ArrayList<Carpet>persianCarpet=new ArrayList<>();
        ArrayList<Carpet>regularCarpet=new ArrayList<>();
        for  (int i=0; i<=carpets.length-1;i++ ){
            if( carpets[i].isPersian){
            persianCarpet.add(carpets[i]);
            }else regularCarpet.add(carpets[i]);
        }
        System.out.println(persianCarpet.size());
        System.out.println(regularCarpet.size());
        System.out.println(regularCarpet);
        

        
    }
}
