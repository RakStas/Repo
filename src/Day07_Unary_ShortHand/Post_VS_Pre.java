package Day07_Unary_ShortHand;

public class Post_VS_Pre {
    public static void main(String[] args) {

      int a =1;
       a=-a--+a++/-a--*--a;
       //
        System.out.println(a);

        int b = 25;
        System.out.println(b++);
        System.out.println(b++);
        System.out.println(b);
        int c = 25;
        int d = c++;
        System.out.println( d       );
        System.out.println(c);
        System.out.println("===============");
        int e =25;
        e++;
        System.out.println(e);
       int  x=8;
       int y = x--;
     System.out.println(y);
     System.out.println(x);
     int r = 33;
     System.out.println(r++);
     int q = r++;
     System.out.println(q);
     System.out.println("===============");
     int w = 50;
     w= --w + w++ + w-- + w++;
     //49 +
     System.out.println(w);










    }
}
