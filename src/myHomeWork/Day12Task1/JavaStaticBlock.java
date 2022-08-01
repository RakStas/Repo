package myHomeWork.Day12Task1;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaStaticBlock {

   static Scanner scan=new Scanner(System.in);
   static int B= scan.nextInt();
   static int H=scan.nextInt();;
   static boolean flat=true;

   static {
       try {
           if (B<=0||H<=0){
               flat=false;
               throw new RuntimeException("Must be bigger 0");
           }
       }catch (RuntimeException e){
           System.out.println(e);
       }
   }




    public static void main(String[] args) {
        if(flat){
            int area=B*H;
            System.out.print(area);
        }
    }


}
