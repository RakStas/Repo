package Day36_ArrayListContinue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Collections_Practice {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(15);list.add(115);list.add(125);list.add(150);list.add(90015);
        Collections.sort(list);
        for (int i=list.size()-1; i>=0; i--){
           // System.out.print(list.get(i)+" ");

        }

        ArrayList<String>names=new ArrayList<>();
        names.add("A");
        names.add("B");
        names.add("C");
        names.add("D");
        names.add("E");
        Collections.swap(names, 1, 2); //[A, C, B, D, E]
        System.out.println(names);

       //CollectionsFrequencies
        ArrayList<Character>ch=new ArrayList<>();
        ch.add('A');
        ch.add('A');
        ch.add('B');
        ch.add('B');
        ch.add('C');
            int count = Collections.frequency(ch, 'A'); //видає число скільки разів вводив число
        System.out.println(count);

    }
}
