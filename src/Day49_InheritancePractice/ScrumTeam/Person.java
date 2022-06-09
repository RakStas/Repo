package Day49_InheritancePractice.ScrumTeam;

public class Person {
        public String name;
        public int age;
        public char gender;

        private long snn;

    public void setSnn(long snn) {
        this.snn = snn;
    }

    public long getSnn() {
        return snn;
    }

    public void setInfo(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;

    }
    private void eat(){
    System.out.println(name+" is eating");
}
    private void walk (){
            System.out.println(name + " is walking");
        }
    public void sleep (){
        System.out.println(name + " is sleeping");
    }


}
