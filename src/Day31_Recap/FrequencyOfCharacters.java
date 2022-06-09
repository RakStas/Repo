package Day31_Recap;
import Library.Util;
public class FrequencyOfCharacters {
    public static void main(String[] args) {
     String str = "aaabbbccfftgggh";
     String result ="";
     String nonDup =  Util.removeDup(str);

     System.out.println(result);
      for (char each : nonDup.toCharArray()){
          int count=Util.frequency(str, each);
          result+=""+each +count;
      }

      System.out.println(result);







        }

    public static String FrequencyOfCharacters (){
     String result = "";





        return result;
    }
}
