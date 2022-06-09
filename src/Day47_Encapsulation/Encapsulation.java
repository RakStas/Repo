package Day47_Encapsulation;

public class Encapsulation {
    private int snn=1001;

    public int getSnn(){
       return snn;
    }

    public void  setSnn(int snn){
       this.snn=snn;
    }
    public String toString(){
        return ""+snn;
    }
}
