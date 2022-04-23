package Day26_Multi_Dimensional_Array;

import java.util.Arrays;

public class MultiDArray_Practice {
    public static void main(String[] args) {
       /* testers {"Lilia", "Stas", "Alina", "Emilichka}
          developers {"Yana", "Oleksiy", "Nadiya", "Anastasiya"}
          sm {"Oleg"}
          PO {"Tanya"}
          BA {"Valeriy"}
        */
        String [] testers = {"Lilia", "Stas", "Alina", "Emilichka"};
        String [] developers = {"Yana", "Oleksiy", "Nadiya", "Anastasiya"};
        String [] ms ={"Oleg"};
        String [] PO = {"Tanya"};
        String []BA = {"Valeriy"};

        String [][] SCRUM ={testers, developers, ms, PO, BA};
        System.out.println(Arrays.deepToString(SCRUM));
        SCRUM[1][1]="Lucky";
        System.out.println(Arrays.deepToString(SCRUM));

        for (String[] each: SCRUM){
             for (String name :each){
            System.out.println(name);
             }
           // System.out.println(Arrays.deepToString(each));
        }

        System.out.println("=======================================");
        int [][] scores= {{10,20,30,45},{60,55,75,105},{93,48,125,135}};
        for (int[] each1DArray:scores){
            for (int eachElement:each1DArray){
                if (eachElement%2==0&&eachElement%5==0){
                    System.out.print(eachElement+" ");
                }
              //  System.out.println();
              //  System.out.print(eachElement+" ");
            }
        }

        int [][] num2= {{1,2},{3,4}};
        int [][] num3= {{5,6},{7,8}};
        int [][] num4= {{9,10},{11,12}};

        int [][][] arr3d={{{1,2},{3,4}},{{5,6},{7,8}},{{9,10},{11,12}}};
        















    }
}
