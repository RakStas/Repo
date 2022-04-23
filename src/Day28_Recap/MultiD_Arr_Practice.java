package Day28_Recap;

import java.util.Locale;

public class MultiD_Arr_Practice {
    public static void main(String[] args) {

        String [] group1 = {"Alina 1", "Stas 1", "Emilichka 1", "Lucky 1"};
        String [] group2 = {"Alina 2", "Stas 2", "Emilichka2", "Lucky2"};
        String [] group3 = {"Alina3", "Stas3", "Emilichka3", "Lucky3"};        
        String [] group4 = {"Alina 4", "Stas4", "Emilichka4", "Lucky4"};
        String [] group5 = {"Alina 5", "Stas 5", "Emilichka 5", "Lucky 5"};
        
        String cyberteck[][]={group1, group2, group3, group4, group5};
        
        
        for (int i=0; i<=cyberteck.length-1; i++){
            String eachGroup []=cyberteck[i];

          for (int j=0; j<=eachGroup .length-1; j++ ){
              String  eachStudent = eachGroup[j];
              if (eachStudent.toLowerCase(Locale.ROOT).contains("m")){

              System.out.print(eachStudent+"  ");}
          }System.out.println();
        }









    }
}
