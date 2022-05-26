package Day44_Constructor;

public class Student {
    String name;
    int age;
    char gender;
    static String nameSchool="Cybertek School";

    public Student (String name, int age, char gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }


    /*public void SetInfo(String name, int age, char gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
            }*/
    public String toString(){
        return name+" is "+age+" years old, and student is "+gender+"" +
                "\n"+nameSchool;
    }



    }





