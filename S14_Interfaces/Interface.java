public class Interface
{
    public static void main(String[] args) {
        A a = new B();
        a.meth1();
        a.meth2();
        a.meth3();
    }
}

interface A
{
    void meth1();
    void meth2();
}

class B implements A
{
    public void meth1()
    {
        System.out.println("meth1");
    }
    public void meth2()
    {
        System.out.println("meth2");
    }
    public void meth3()
    {
        System.out.println("meth3");
    }
}