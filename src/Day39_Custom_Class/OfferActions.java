package Day39_Custom_Class;

import java.util.ArrayList;
import java.util.Arrays;

public class OfferActions {
    public static void main(String[] args) {
        Offer offer1=new Offer();
        Offer offer2=new Offer();
        Offer offer3=new Offer();
        Offer offer4=new Offer();

        offer1.SetInfo("Chicago", true, 45000, false, "QA");
        offer2.SetInfo("New York", false, 1000, false, "PO");
        offer3.SetInfo("Washington", true, 18000, true, "SM");
        offer4.SetInfo("Chicago", false, 25000, false, "Dev");


        ArrayList<Offer>offerList=new ArrayList<>();
        offerList.addAll(Arrays.asList(offer1, offer2, offer3, offer4));

        for(Offer each: offerList){
        each.getInfo(); }

        System.out.println("==============================");
        offerList.removeIf(p->!p.jobTitle.equals("QA"));
                for (Offer each: offerList){
                    System.out.println(each.location+" " +each.salary+each.jobTitle);
                }
        System.out.println("===============================");
                ArrayList<Offer>list2=new ArrayList<>();
                list2.addAll(Arrays.asList(offer1, offer2, offer3, offer4));
        list2.removeIf(p->p.location.equals("Chicago"));
                for(Offer each:offerList){
                    System.out.println(each.location+" "+each.salary);
                }

    }
}
