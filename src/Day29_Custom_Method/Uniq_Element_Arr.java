package Day29_Custom_Method;

public class Uniq_Element_Arr {
    public static void main(String[] args) {
        String [] arr={"A", "C#", "C#", "Java", "Pyton", "Pyton", "C++"};
        UniqElements(arr);
        System.out.println("Hello");
    }

    public static void UniqElements(String words[]) {


        for (String each:words){
            int count = 0;
            for (String each1:words){
                if(each==each1){
                    count++;
                }
            }
            if (count==1){
                System.out.print(each+" ");

            }
        }
        System.out.println();
    }
}