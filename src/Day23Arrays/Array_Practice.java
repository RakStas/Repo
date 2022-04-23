package Day23Arrays;

public class Array_Practice {
    public static void main(String[] args) {
       // String students = "Muhtar", "Nader", "Asia";

        String [] students={"Muhtar", "Stas", "Cybertek", "Alina"}; //створення багатох перемінних одного типу через Array
        //                    0           1        2           3
            students [1]="aladin";


          /*  String name1=students[0];
        System.out.println(name1);
        System.out.println(students[1]);*/

        int [] score = {85, 44 , 55, 56, 85}; //size 5
        //               0   1   2    3
        String names []={"tom", "jesica", "Oleg", "Ivan", "Lesya"}; //size 5
        for (int i=0; i<=score.length-1; i++){
            System.out.println(score[i]+" "+names[i]);
        }
        System.out.println("========================");
        System.out.println();

        String classMates[]=new String[3]; //size is 5,
        classMates[0]="Koliya";
        classMates[2]="Vika";
        classMates[1]="alina";

        for (int i=0; i<= classMates.length-1; i++){
            System.out.println(classMates[i]);

        }


    }
}
