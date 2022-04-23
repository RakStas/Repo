package Day29_Custom_Method;

public class MaxAndMinNumbers {
    public static void main(String[] args) {
        int numbers []={52,258,245,988,};
        MaxMin(numbers);
    }
public static void MaxMin(int num[]){

    int max=num[0];
    int min =num[0];
        for (int each:num){
            if(each>max){
               max=each;
            }
            if(each<min){
                min=each;
            }
        }
    System.out.println("Max is "+max+"; min is "+min+";");
    }







}
