package Day47_Encapsulation;

import javax.xml.bind.SchemaOutputResolver;
import java.time.LocalDate;


public class PersonObj {
    public static void main(String[] args) {

        Person prs1=new Person("Alina Rak", 25, 'F', LocalDate.of(1996, 11 ,30));
        System.out.println(prs1);
        prs1.setID(225588);
        prs1.setAddress("Denmark");
        prs1.setID(19620);
        prs1.setSsn(300693037);
        System.out.println();
        System.out.println("Person ID: "+prs1.name+" "+prs1.getID());
        System.out.println("Address of "+prs1.name+" is "+prs1.getAddress());
        System.out.println("SNN owner: "+prs1.name+" "+prs1.getSsn());
    }
}
