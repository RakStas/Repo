package Day09_If_Statement;

public class if_task {
    public static void main(String[] args) {
        int age = 17;

        boolean ID = true;
        boolean eligible= age >=18&&ID;

        String result = "";
        if (eligible==true){
            result="Go and buy what you want";
        }
        if (eligible==false){
            result="stay at home and drink milk";
        }
        System.out.println(result);

    }
}
