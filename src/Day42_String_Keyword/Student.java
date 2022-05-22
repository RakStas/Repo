package Day42_String_Keyword;

public class Student {
    String name;
    int age;
    int groupNum;
    char gender;
    static String schoolName="Cybertek";
    static  String bestTeacher ="Nadir";

    public void setInfo(String name,int age, int groupNum,char gender){
        this.name=name;
        this.age=age;
        this.groupNum= groupNum;
        this.gender= gender;

            }
        public String toString(){
        return "Name is "+name+"\nSchool name is "+schoolName;
                    //    instance                 Static
    }


}
