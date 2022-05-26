package Day45_Java_Recap_Constructor;

public class Item {
    int quantiny;
    double unitPrice;
    String name;

    public Item(int quantiny, double unitPrice, String name) {
        this.quantiny = quantiny;
        this.unitPrice = unitPrice;
        this.name = name;
    }


        public double costCalk(){
        return quantiny*unitPrice;
        }


   /* public void Item(int quantiny, double unitPrice, String name){
        this.quantiny=quantiny;
        this.unitPrice=unitPrice;
        this.name=name;
    }*/
    public String toString(){
        return " \"Hello world\" " +name+"; Price is: "+quantiny*unitPrice;
    }


}
