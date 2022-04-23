package Day29_Custom_Method;

public class ReturnKeyword {
    public static void main(String[] args) {
        grade(100);
        alcohol_buy(50);
    }


    public static void grade (int score ){
        if (score<0||score>100){
            System.out.println("Invalid");
            return;
        }

        char grade = (score>=90)?'A':(score>=80)?'B':(score>=70)?'C':(score>=60)?'D':'F';
        System.out.println("Grade is "+grade);
        
    }

public static void alcohol_buy(int age){

    if (age <21){
        System.out.println("You age not eligible to buy alcohol");
        return;
    }
    System.out.println("Are you eligible to boy alcohol?");

}





}
