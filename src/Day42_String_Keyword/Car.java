package Day42_String_Keyword;

public class Car {
    String brand;
    String model;
    int year;
    String VIN;
    String color;
    double price;
    boolean hasSteelingWheel;

    static boolean hasWheel=true;
    static int numbersOfTires=4;
    static boolean hasEngine=true;
    static boolean hasDoors=true;
    static boolean hasAirbag=true;
    static boolean hasSeatBelt=true;
    static boolean hasRoof=true;

        public  void start() {
        System.out.println("Starting"+brand+" "+model);
    }
        public static void printTires(){
            System.out.println(numbersOfTires+" Tires");
    }

        public String toString(){
            return color+" "+ brand+" "+model+" "+"was make in "+year+"year"+"\nHas engine"+hasEngine+"\nHas Doors? "+hasDoors
            +"\nHas Airbag"+hasAirbag+ "\nHas SeatBelt"+hasSeatBelt+"\nHas Roof?"+hasRoof;
    }


}

