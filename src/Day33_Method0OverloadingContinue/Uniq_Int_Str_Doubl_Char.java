package Day33_Method0OverloadingContinue;

import java.util.Arrays;

public class Uniq_Int_Str_Doubl_Char {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 3, 3, 5};
        for (int each : arr) {
            int count = 0;
            for (int each1 : arr) {
                if (each == each1) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(each + " ");
            }
        }
        System.out.println();
        System.out.println("==================");
    double n2[]={54,65.25,998,66};
    uniqueInt(n2);
    String s3[]={"f","d", "d"};
    uniqueInt(s3);
    char ch[]={'f', 'f', 'g'};
    uniqueInt(ch);
        System.out.println(Arrays.toString(n2));
        System.out.println(Arrays.toString(s3));
        System.out.println(Arrays.toString(ch));



    }

    public static void uniqueInt(int[] arr) {

        for (int each : arr) {
            int count = 0;
            for (int each1 : arr) {
                if (each == each1) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(each + " ");
            }

        }
        System.out.println();
    }
    public static void uniqueInt(double[] arr) {

        for (double each : arr) {
            int count = 0;
            for (double each1 : arr) {
                if (each == each1) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(each + " ");
            }

        }
        System.out.println();
    }
    public static void uniqueInt(char[] arr) {

        for (char each : arr) {
            char count = 0;
            for (char each1 : arr) {
                if (each == each1) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(each + " ");
            }

        }
        System.out.println();
    }
    public static void uniqueInt(String[] arr) {

        for (String each : arr) {
            int count = 0;
            for (String each1 : arr) {
                if ( each.equals(each1) ) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(each + " ");
            }

        }
        System.out.println();
    }
}

