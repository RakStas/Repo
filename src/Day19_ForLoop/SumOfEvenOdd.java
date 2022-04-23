package Day19_ForLoop;

public class SumOfEvenOdd {
    public static void main(String[] args) {
/* write a program that can calculate the sum of all the even numbers between 1 ~ 100

     write a program that can calculate the sum of all the odd numbers between 1 ~ 100*/

        System.out.println();
        System.out.println("=============");
        System.out.println("Завдання №1, сума парних числел від 1 до 100");
        int sumOfEen = 0;
        //for(int i =0; i<=100; i+=2){

        for (int i = 0; i <= 100; i += 2) { //інша умова через ремаіндер
            if (i % 2 == 0) {
                sumOfEen += i; //сума всих чисел які будуть присвоєні "і"
            }
        }
        System.out.println(sumOfEen);


        System.out.println();
        System.out.println("=============");
        System.out.println("Завдання №2, сума непарних числел від 1 до 100");
        int sumOfNested = 0;
       /* for (int i = 1; i <= 100; i += 2)

        { if(i%5==0&&i%3==0)
            sumOfNested += i;    //сума всих чисел які будуть присвоєні "і"
        }*/
             for (int i = 1; i<=99; i+=2 ){
                 if (i%2!=0){
                     sumOfNested+=i;
                 }
             }
        System.out.println(sumOfNested);










    }




    }

