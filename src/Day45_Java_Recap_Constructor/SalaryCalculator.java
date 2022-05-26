package Day45_Java_Recap_Constructor;
/*salary(): returns the total salary as double  (hourlyRate * weeklyHours * 48)
        stateTax(): retuns the total state tax as double ( salary * stateTaxRateHo)
        federalTax(): retuns the total federal tax as double ( salary * fedralTaxRate)
        salaryAftertax(): retuns the salary after tax as double ( salary - stateTax - federalTax)
        toString(): returns the hourlyRate, weeklyHours and salary info as calculated by salary()*/
public class SalaryCalculator {
   double hourlyRate;
   static int weeklyHours=40;
   static double StateTax=0.08;
   static double federalTax=0.25;

   public SalaryCalculator(double hourlyRate ){
       this.hourlyRate=hourlyRate;

   }

        public double TotalSalary(){
       return hourlyRate*weeklyHours*52;
        }
        public double StateTax(){
       return  TotalSalary()*StateTax;
        }
        public double FederalTax(){
        return  TotalSalary()*federalTax;
    }
        public double SalaryAfterTax(){
       return TotalSalary()-FederalTax()-StateTax();
    }
        public String toString(){
       return "Your salary before tax are $"+TotalSalary()+"\nYour salary after tax are $"+SalaryAfterTax();
    }
}
