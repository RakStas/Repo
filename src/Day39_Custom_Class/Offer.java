package Day39_Custom_Class;

public class Offer {
    String location;
    boolean Benefits;
    int salary;
    boolean WFH;
    String jobTitle;
public void SetInfo(String OfferLocation, boolean offerBenefits, int OfferSalary,
                    boolean OfferWFH, String OfferJobTitle ){
    location=OfferLocation;
    Benefits=offerBenefits;
    salary=OfferSalary;
    WFH=OfferWFH;
    jobTitle=OfferJobTitle;

}
public void getInfo(){
    System.out.println("Location is "+location+"; Is offer has benefits? "+Benefits+"; Slary is "+salary
    +"; Will you work from home? "+WFH+"; Offer has job like "+jobTitle);

}
}
