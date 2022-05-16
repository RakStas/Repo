package Day42_String_Keyword;

import java.util.ArrayList;
import java.util.Arrays;

public class ScramTeam {
    ArrayList<Tester>testers=new ArrayList<>();
    ArrayList<Developer>developers=new ArrayList<>();
    String PO;
    String BA;
    String SM;

    public void setInfo(String PO, String BA, String SM){
        this.PO=PO;
        this.BA=BA;
        this.SM=SM;
    }
    public void addTester(Tester tester){
        testers.add(tester);
        }
    public void addTesters(Tester [] testers){
        if(testers.length==0){
            return;
        }
            this.testers.addAll(Arrays.asList(testers));
        }
    public void removeTester(int ID){
            testers.removeIf(p->p.ID==ID);
        }
    public void addDeveloper(Developer developer){
        developers.add(developer);
        }
    public void addDeveloper(Developer []developers){
        if(developers.length==0){
            return;
        }
        this.developers.addAll(Arrays.asList(developers));
        }
    public void removeDeveloper(int ID) {
        developers.removeIf(p -> p.ID==ID);
    }

    public String toSting(){
        return "PO name is "+ PO+ "; BA name is "+BA+"; SM name is "+SM;
    }


















}
