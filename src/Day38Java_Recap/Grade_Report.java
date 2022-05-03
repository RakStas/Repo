package Day38Java_Recap;

import java.util.ArrayList;
import java.util.Arrays;

public class Grade_Report {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(-22,58,98,66,99,78,45, 85,105,-5, 55,89,66,58,999,45,22,6,98,56,78,54,12,588,58));
        //90~100 Grade A
        // 70~89 Grade B
        // 60~79 Grade C
        // 50~69 Grade D
        //  0~49 Grade E


        ArrayList<Integer>gradeA=new ArrayList<>();
        gradeA.addAll(list);
        gradeA.removeIf(p->p<90||p>100);
        System.out.println("Grate A: "+gradeA);

        ArrayList<Integer>gradeB=new ArrayList<>();
        gradeB.addAll(list);
        gradeB.removeIf(p->p<80||p>89);
        System.out.println("Grate B: "+gradeB);

        ArrayList<Integer>gradeC=new ArrayList<>();
        gradeC.addAll(list);
        gradeC.removeIf(p->p<70||p>79);
        System.out.println("Grate C: "+gradeC);

        ArrayList<Integer>gradeD=new ArrayList<>();
        gradeD.addAll(list);
        gradeD.removeIf(p->p<60||p>69);
        System.out.println("Grate D: "+gradeD);

        ArrayList<Integer>gradeE=new ArrayList<>();
        gradeE.addAll(list);
        gradeE.removeIf(p->p<0||p>59);
        System.out.println("Grate E: "+gradeE);

        ArrayList<Integer>gradeErr=new ArrayList<>();
        gradeErr.addAll(list);
        gradeErr.removeAll(gradeA);
        gradeErr.removeAll(gradeB);
        gradeErr.removeAll(gradeC);
        gradeErr.removeAll(gradeD);
        gradeErr.removeAll(gradeE);
        System.out.println("Wrong grade is: "+gradeErr);


        System.out.println(gradeA.size()+" students has A");
        System.out.println(gradeB.size()+" students has B");
        System.out.println(gradeC.size()+" students has C");
        System.out.println(gradeD.size()+" students has D");
        System.out.println(gradeE.size()+" students has E");
        System.out.println(gradeErr.size()+ " students fail");







    }




}
