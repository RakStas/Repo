package Day25_Practice;

public class LongestWord {
    public static void main(String[] args) {
        String [] arr={"Stas", "Alina", "Emilichka", "Lucky"};
        int max= arr[0].length();
        for(String each:arr){
                if(max<each.length()){
                max=each.length();
            }
            }
        System.out.println(max);
        for(String each: arr){
            if(each.length()==max){
                System.out.println(each);
            }
        }





    }
}
