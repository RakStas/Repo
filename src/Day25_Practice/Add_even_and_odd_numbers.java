package Day25_Practice;

public class Add_even_and_odd_numbers {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7,8,9,10,11};
        int even = 0;
        int odd= 0;
        String str = "";
        String str1="";
        for (int each:nums){
            if (each%2==0){
                even+=1;

            str +=each+" ";

            }else {
                odd++;
                str1 +=each+" ";
            }

        }
        System.out.print(even+", "+str);
        System.out.println();
        System.out.print(odd+", "+str1);
    }
}
