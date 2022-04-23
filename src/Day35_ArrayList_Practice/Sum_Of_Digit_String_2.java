package Day35_ArrayList_Practice;

public class Sum_Of_Digit_String_2 {
    public static void main(String[] args) {
        String str = "a1b2c3";
        int sum=0;
        for ( char each : str.toCharArray () ){
            if(Character.isDigit(each)){
                sum+=Integer.parseInt(each+"");
            }
        }
        System.out.println(sum);




    }
}
