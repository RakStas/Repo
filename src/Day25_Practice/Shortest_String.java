package Day25_Practice;

public class Shortest_String {
    public static void main(String[] args) {
        String [] arr={"Anam","Glass","Stasnislav","Ameruka", "A", "adsdfdsfddf"};

        int minLength= arr[0].length();
        int maxLength = 0;

        for (int i=0; i<=arr.length-1; i++ ){
            int l = arr[i].length();
            if (minLength<=l){
                minLength=l;
                System.out.println(minLength);
            }


        }








    }
}
