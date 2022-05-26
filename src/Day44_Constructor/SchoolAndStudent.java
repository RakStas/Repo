package Day44_Constructor;

public class SchoolAndStudent {
    public static void main(String[] args) {
      Student student1=new Student("Alina", 25, 'F');
      Student student2=new Student("Stas", 29, 'M');
      Student student3=new Student("Lucky", 3, 'M');

    /* student1.SetInfo("Alina", 25, 'F');
     student2.SetInfo("Stas", 29, 'M');
     student3.SetInfo("Lucky", 3, 'M');*/

        System.out.println(student1);
        System.out.println();
        System.out.println(student2);
        System.out.println();
        System.out.println(student3);




    }
}
