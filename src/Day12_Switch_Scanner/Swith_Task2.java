package Day12_Switch_Scanner;

public class Swith_Task2 {
    public static void main(String[] args) {
        int num = 1;
        String month = "";
        switch (num){
            case 1:  month="Jan";
            break;
            case 2:  month="Feb";
                break;
            case 3:  month="March";
                break;
            case 4:  month="Apr";
                break;
            case 5:  month="May";
                break;
            case 6:  month="Jul";
                break;
            case 7:  month="jun";
                break;
            case 8:  month="Oug";
                break;
            case 9:  month="Sep";
                break;
            case 10:  month="Oct";
                break;
            case 11:  month="Nov";
                break;
            case 12:  month="Dec";
                break;



            default:month="No montj with this number";
        }
        System.out.println(month);
    }

}
