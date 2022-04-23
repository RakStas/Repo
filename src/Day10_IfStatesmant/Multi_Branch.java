package Day10_IfStatesmant;

public class Multi_Branch {
    public static void main(String[] args) {

        double number =1.0;

        if(number>0){
            System.out.println(number+ "is positive");
        }
        if(number<0) {
            System.out.println(number + " is negative");
        }
        if (number ==0) {
            System.out.println(number+" is zero");
        }
        System.out.println("=============================");

        if (number>0){
            System.out.println(number+" is positive");
        }else if(number<0){
            System.out.println(number+ "is negative");
        }else {
            System.out.println(number+" is zero");
        }
    }
}
