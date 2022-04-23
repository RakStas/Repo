package Day12_Switch_Scanner;

public class Switch_Task {
    public static void main(String[] args) {

        int days_of_week = 1;
        String nameDay ="";
        switch (days_of_week){
            case 1: nameDay="Monday";
            break;
            case 2: nameDay="Tuesday";
            break;
            case 3: nameDay="Wednesday";
            break;
            case 4: nameDay="Thursday";
            break;
            case 5: nameDay="friday";
            break;
            case 6: nameDay="Saturday";
            break;
            case 7: nameDay="Sunday";
            break;
            default: nameDay="there is no that day, and you are stupid";
        }
        System.out.println(nameDay);

        }

    }

