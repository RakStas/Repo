package Day29_Custom_Method;

public class RemoveDuplicates {
    public static void main(String[] args) {
        removeDuplicate("abababddd dsfg fbnhgs ");
    }
    public static void removeDuplicate(String str){
        String nonDup="";

        for(String each:str.split("")){
            if(!nonDup.contains(each)){
                nonDup+=each;
            }
        }
        System.out.println(nonDup);

    }




}
