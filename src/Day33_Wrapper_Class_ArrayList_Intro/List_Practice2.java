package Day33_Wrapper_Class_ArrayList_Intro;

import java.util.ArrayList;

public class List_Practice2 {
    public static void main(String[] args) {
        ArrayList<Integer> oddList = new ArrayList<>();
        ArrayList<Integer> evenList = new ArrayList<>();
        for (int i=0; i<=50; i++){
            if (i%2==0){
                evenList.add(i);

            }
          else {
                oddList.add(i);
            }
        }
        System.out.print(evenList);
        System.out.println();
        System.out.print(oddList);
        System.out.println("___________________________");


        ArrayList<String>groceryList=new ArrayList<>();
        groceryList.add("Milk");
        groceryList.add("Mushrooms");
        groceryList.add("Meat");
        groceryList.add("Apples");
        groceryList.add("IceCream");
        groceryList.add("Potatoes");
        int count =1;
        System.out.println("List for buying is ");
        for (int i=groceryList.size()-1; i>=0; i--){
            System.out.println(count+". "+groceryList.get(i));
            count++;
        }
        System.out.println("!!!!   Break, DRINK BEAR   !!!!!");
        int count1=1;
        for (String each:groceryList){
            System.out.println(count1+". "+each);
            count1 ++;
        }



    }
}
