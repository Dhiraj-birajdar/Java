import java.time.LocalDate;
import java.util.Date;
class Student
{
    static private LocalDate d = LocalDate.now();
    static private int rno = 100;
    String rollno;

    Student()
    {
        this.rollno = "PU-"+d.getYear()+"-"+(++rno);
    }
}

class A1
{
    // System.out.println(Date.getYear()+1900);
    public static void main(String[] args)
    {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
       

        System.out.println(s1.rollno);
        System.out.println(s2.rollno);
        System.out.println(s3.rollno);
    }
}