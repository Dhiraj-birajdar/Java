package dbpack;
public class HelloWorld
{
    static int x=value2(2); //This is first static initializer
    public  int a=value(10);//This is first non-static initializer
    public  String s;  //This is second non-static initializer

    static {
        System.out.println("static block");
    }
    {
        System.out.println("Starting of Non static initializer");
        display();
        System.out.println("Ending of Non static initializer");
    }
    public  void display()
    {
        System.out.println("Starting of display method");
        System.out.println(a);
        System.out.println(s);
        System.out.println("Ending of display method");
    }
    public int value(int a)
    {
        System.out.println("Starting of value method");
        System.out.println("Ending of value method");
        return a;
    }
    static public int value2(int a)
    {
        System.out.println("Starting of static value2 method");
        System.out.println("Ending of static value2 method");
        return a;
    }
    public HelloWorld(int a, String s)
    {
        System.out.println("Starting of parameterized constructor");
        this.a = a;
        this.s = s;
        System.out.println("Ending of parameterized constructor");
        System.out.println(" "+this+" "+this.hashCode());
    }

    public static void main(String[] args)
    {
        HelloWorld t1=new HelloWorld(10,"Shubham");
    }
}

