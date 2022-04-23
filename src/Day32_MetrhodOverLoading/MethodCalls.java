package Day32_MetrhodOverLoading;
import Library.Util;
public class MethodCalls {
    public static void main(String[] args) {
    String firstName="Emilichka";
    String lastName = "StaniSlaVivNa";
    String fullName = Util.FormatFull_name(firstName, lastName);
        System.out.println(fullName);
        String uniq=Util.uniques(fullName);
        System.out.println(uniq);

        String nonDup = Util.removeDuplicate(fullName);
        System.out.println(nonDup);

    }




}
