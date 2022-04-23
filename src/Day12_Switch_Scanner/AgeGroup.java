package Day12_Switch_Scanner;

public class AgeGroup {
    public static void main(String[] args) {


        int age =35;
        String ageGroup="";
        if(age>=0&&age<=150){
            if(age<21){ageGroup="Teenager";
            }else if (age <=55){ageGroup="You can bay sigarets and alcohol, and then fuck all girls))";
            }else {ageGroup="Senior";}

        }else {ageGroup="People don't live to long life, so, Sorry, but NO!!!";}
        System.out.println(ageGroup);
    }
}
