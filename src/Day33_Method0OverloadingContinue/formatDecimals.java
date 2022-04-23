package Day33_Method0OverloadingContinue;

import java.text.DecimalFormat;

public class formatDecimals {
    public static void main(String[] args) {

        DecimalFormat df=new DecimalFormat("0");
        double doub=20/3.0;
        System.out.println(df.format(doub));
        int a=20/3;
        System.out.println(a);
    }


}
