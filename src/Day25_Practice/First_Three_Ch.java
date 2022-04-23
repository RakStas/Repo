package Day25_Practice;
/*Напишіть програму, яка візьме п’ять рядків і збереже їх у масив під назвою arr.
        і Використовуйте цикл for, щоб роздрукувати перші три літери кожного елемента arr, по одній на рядок.
        Можна припустити, що кожен елемент arr має принаймні 3 літери.

        Example: arr -> ["apple", "banana"]
                        prints:  appban
                        */
public class First_Three_Ch {
    public static void main(String[] args) {
        String []word={"Apple", "Banana", "Strawberry", "Java", "Python"};
      //  for(int i=0; i<=word.length-1; i++){
            for (String each: word){
        System.out.print(each.substring(0,3)+" ");
        }

    }
}
