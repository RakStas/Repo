package Day23Arrays;

public class Shopping {
    public static void main(String[] args) {

        String [] shoppingList =new String[7];
        shoppingList[0] = "Toilet paper";
        shoppingList[1]="Hand Sanitizer";
        shoppingList[4]="Eggs";
        shoppingList[6]="Beer";
        shoppingList[2]="Bread";
        shoppingList[3]="Milk";
        shoppingList[5]="Water";
        int g=0;
        for (int i=0; i<=shoppingList.length-1; i++){
            g++;
            System.out.println(g+". "+shoppingList[i]);





        }




    }
}
