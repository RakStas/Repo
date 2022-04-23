package myHomeWork.Day12Task1;

public class a3b4c5 {
    public static void main(String[] args) {
        String str = "abbcccddddfffff";
        String nonDup="";
        String result = "";
        for (int i=0; i<=str.length()-1; i++){
            String ch = ""+str.charAt(i);
            if(!nonDup.contains(ch)){
                nonDup+=ch;
            }
        }
        for (int i = 0; i <=nonDup.length()-1 ; i++) {
            char ch = nonDup.charAt(i);
            int count =0;
            for (int j=0; j<=str.length()-1; j++){
                if (str.charAt(j)==ch){
                    count++;
                }
            }
        result+=""+ch+count;
        }
        System.out.println(result);


    }
}