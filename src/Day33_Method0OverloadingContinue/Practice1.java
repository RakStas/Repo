package Day33_Method0OverloadingContinue;

import java.time.LocalDate;

public class Practice1 {
    public static void main(String[] args) {
        String []name={"Alina", "Emilichka", "Nadiya", "Oleksiy", "Lucky"};
        LocalDate DOB[]={LocalDate.of(1996, 11, 30),
                         LocalDate.of(2020, 05, 14),
                         LocalDate.of(1975, 2, 20),
                         LocalDate.of(1966, 03, 21),
                         LocalDate.of(2019, 07,30)
        };
    for (int i=0; i<= name.length-1; i++ ){
        System.out.println(name[i]+" : "+DOB[i]);
    }
        for (LocalDate each:DOB){  //друкує тільки не високосний рік
            if(each.isLeapYear()){
            System.out.println(each);}
        }


    }
}
