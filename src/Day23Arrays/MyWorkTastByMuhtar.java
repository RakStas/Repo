package Day23Arrays;

public class MyWorkTastByMuhtar {
    public static void main(String[] args) {

        String str = "ababab";

        String non = "";


        for (int i=0; i<=str.length()-1; i++) {
            String ch = "" + str.charAt(i);
            if (non.contains(ch)) {
                continue;

            } else {
                non += ch;
            }
        }
        System.out.println(non);

        /*
        for (int j=0; j<=non.length()-1;j++){
            char ch=non.charAt(j);
            int conc=0;
            for(int i=0; i<=str.length()-1;i++){
                if(str.charAt(i)==ch){
                    conc+=1;
                }
            }
            last=conc+non+"";
        }

        System.out.println(last);*/

        String last = "";
        // str=ABAB    non =AB ===> A2B2

        for (int u=0; u<=non.length()-1; u++) {
            char ch1 = non.charAt(u);
            int count1 = 0;
            for (int j = 0; j <= str.length() - 1; j++) {
                if (str.charAt(j) == ch1) {
                    count1 ++;

                }
            }
            last += "" + non + count1;
        }

        System.out.println(last);



    }
    }

