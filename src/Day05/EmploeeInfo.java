package Day05;

public class EmploeeInfo {
    public static void main(String[] args) {

        /*first name
        second name
        gender
        age
        companyName
        jobTitle
        isFullTime
        isMarried
        salary

         */

        String firstName = "John";
        String lastName = "Daniel";
        char gender = 'M';
        int age = 35;
        String companyName = "CapitalOne";
        String jobTitle = "SDET";
        boolean isFullTine = true;
        boolean isMarried = true;
        double salary = 120000.5;
        String fullName = firstName+" "+lastName;
        /*Employee' full name is: John Daniel
                        John Daniel' gender is: Male
                        John Daniel' age is: 35 years old
                        John Daniel works at: CapitalOne
                        John Daniel' Job title is: SDET
                        John Daniel' salary is 120000.5 $
                        John Daniel is full time employee: true
                        John Daniel is married: false*/
        System.out.println("Employee' full name is: "+fullName);
        System.out.println(fullName+"' "+"gender is: "+gender);
        System.out.println(fullName+"' "+"age is: "+age+" years old");
        System.out.println(fullName+" work at: "+companyName);
        System.out.println(fullName+"' Job title is: "+jobTitle);
        System.out.println(fullName+"' salary is $"+salary);
        System.out.println(firstName+" "+lastName+" is full time employee: "+isFullTine);
        System.out.println(firstName+" "+lastName+" is married: "+isMarried);
        int a = 3;
        double b = 10;
        System.out.println(b/a);



    }
}
