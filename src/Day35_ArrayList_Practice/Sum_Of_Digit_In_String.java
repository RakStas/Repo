package Day35_ArrayList_Practice;



public class Sum_Of_Digit_In_String {
    public static void main(String[] args) {
        String str = "a1b2c3d4";
        int sum = 0;
        for (int i=0; i<=str.length()-1; i++){
            char ch=str.charAt(i);
            if(ch>=48&&ch<=57){
                sum+=Integer.parseInt(""+ch); //convert to integer and add to sum
            }
        }
        System.out.println(sum);
    }
}
