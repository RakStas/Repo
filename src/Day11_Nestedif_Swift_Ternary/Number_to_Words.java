package Day11_Nestedif_Swift_Ternary;

public class Number_to_Words {
    public static void main(String[] args) {

        /*write a java program that can convert numbers between 0 ~ 9 to words,
         if the number is greater than 9 or less than zero, out put should be "Invalid".
         */
        int number =10;
        String word = "";
        if (number==1){
            word="one";
        }else if (number==2){
            word="two";
        }else if (number==3){
            word="three";}
        else      if (number==4){
            word="four";
        }else      if (number==5){
            word="five";
        }else      if (number==6){
            word="six";
        }else      if (number==7){
            word="seven";
        }else      if (number==8){
            word="eight";
        }else      if (number==9){
            word="nine";

        }else      if (number==0) {
            System.out.println(number);
        }else  {word="invalid";}
        System.out.println(word);
    }
}
