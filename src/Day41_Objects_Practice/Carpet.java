package Day41_Objects_Practice;
 /*create a custom class for the Carpet class that should contain the following:
                instance variables:
                        width, length, unitPrice, isPersian (boolean)
                instance methods:
                        customOrder(): sets the carpet' width, length, unitprice, & isParsian
                        calcCost(): should be able to caculate the total cost of the carpet and return it as double
                        getCarpetInfo(): should be able to display all the info of the carpet including
                        the total cost of the carpet as calculated by calcCost()
            total price of carpet= (width*length)*unitprice
            if the carpet is persian  carpet that's came from Turkey, add 200$ to the totalPrice*/
public class Carpet {
     double width;
     double length;
     double unitPrice;
     public boolean isPersian;

     public void info(double width, double length, double unitPrice, boolean isPersian) {
        this.width=width;
        this.length=length;
        this.unitPrice=unitPrice;
        this.isPersian=isPersian;
     }

     public double CalcCost (){
         double totalPrice=(width*length)*unitPrice;
         if(isPersian){
             totalPrice+=200;
         }
         return totalPrice;
     }

     public void GetInfo(){
         System.out.println("======================");
         System.out.println("Довжина; "+width);
         System.out.println("Length: "+length);
         System.out.println("Unit price is: "+unitPrice);
         System.out.println("Is Persia? "+isPersian);
         System.out.println("Total Price is: "+CalcCost());


     }

     public void CustomOrder(){

     }
     public  String toString(){
         return "Width: "+width;
     }
 }
