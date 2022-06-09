package Day47_Encapsulation;

import java.time.LocalDate;


public class Person {
    public  String name;
    public int age;
    public char gender;
    public LocalDate DOB;

    private long ssn;
    private   long  ID;
    private String address;

    public Person(String name, int age, char gender, LocalDate DOB) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.DOB = LocalDate.from(DOB);
    }

    public long getSsn() {
        return ssn;
    }
    public long getID() {
        return ID;
    }
    public String getAddress() {
        return address;
    }
    public void setSsn(long ssn) {
        this.ssn = ssn;
    }
    public void setID(long ID) {
        this.ID = ID;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person: "+
                "\nName - " + name +
                "\nAge - " + age +
                "\nGender -" + gender +
                "\nDay of birth - " + DOB;
    }
}
