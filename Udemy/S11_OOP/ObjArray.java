public class ObjArray {
    public static void main(String[] args) {
        Subject sub[] = new Subject[3];
        sub[0] = new Subject(1,"Math",100,89);
        sub[1] = new Subject(2,"Electronics",100,85);
        sub[2] = new Subject(2,"English",100,80);

        Student stu = new Student(1,"Dhiraj Birajdar", "Computer Science", sub);
        System.out.println(stu.details());
    }
}

class Student
{
    private int rno;
    private String name;
    private String dept;
    private Subject sub[];

    public Student(int rno, String name, String dept, Subject[] sub)
    {
        this.rno = rno;
        this.name = name;
        this.dept = dept;
        this.sub = sub;
    }
    public String details()
    {
        String str = "rno : "+rno+", name : "+name+", dept : "+dept+", \nsubjects : ";
        for(Subject s: sub) 
            str += "\n"+s.details();
        return str;
    }

}

class Subject
{
    private int id;
    private String name;
    private int maxMarks;
    private double marksObtain;
    
    public Subject(int i, String n, int mm, double mo)
    {
        id = i;
        name = n;
        maxMarks = mm;
        marksObtain = mo;
    }

    public void setMarksObtain(int m) { marksObtain = m;}
    public String details()
    {
        return "subId : "+id+", subName : "+name+", maxMarks : "+maxMarks+", marksObtained : "+marksObtain;
    }
}
