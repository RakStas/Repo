package Day20_WhileLoop;

public class StrinGabcabcaabb {
    public static void main(String[] args) {
        String str="abcabcaabb"; //ab

       String result="";

        for(int i=0; i<=str.length()-1; i++){


           String s = str.charAt(i)+"";
            if(!result.contains(s)){  //використали стрінгКонтейнс
               result+=s;
            }

        }
        System.out.print(result);








    }
}
