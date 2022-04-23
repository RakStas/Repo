package Day31_Recap;
/*write a return method called frequency that accepts two parameters: string str and char ch, the method returns the frequency of the ch from the str as an int
			Ex:
				frequency("AAA", 'A') ==>  3
				frequency("ABAB", 'B') ==> 2

			Note: MUST use Arrays and for each loop

			please copy paste the method to the util class

 */
public class WarmTask {
    public static void main(String[] args) {
    String str="Alinaaaa";
    String unique="";

    for (char each:str.toCharArray()) {
        int count = frequency(str, each);
        if (count == 1) {
            unique += each;
        }
    }
        System.out.println(unique);
        System.out.println("===================");
        String str2="Esben";
        String uniques2=uniques(str2);
        System.out.println(uniques2);

    }
    public static int frequency(String str, char ch){ //check how much equals char in string
        int count =0;
        for (char each:str.toCharArray()){
            if (each==ch){
                count++;
            }
        }
        return count;
    }
    public static String uniques (String str){
        String uniques = "";
        for (char each:str.toCharArray()) {
            int count = frequency(str, each);
            if (count == 1) {
                uniques += each;
            }
        }
        return uniques;
    }



}
