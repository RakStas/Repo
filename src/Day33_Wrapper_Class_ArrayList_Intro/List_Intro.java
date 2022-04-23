package Day33_Wrapper_Class_ArrayList_Intro;
import java.util.ArrayList;
import java.util.Arrays;
public class List_Intro {
    public static void main(String[] args) {
        int a=5;

        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(1);  //0
        scores.add(2);  //2
        scores.add(3);  //3
        scores.add(1,5);   //1
        System.out.println(scores);
        System.out.println("scores get is "+scores.get(1));
        System.out.println("size is "+scores.size());
    }




}
