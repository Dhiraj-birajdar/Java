class ExtendingInterface
{
    public static void main(String[] args)
    {
        C c = new C();
        c.meth1();
    }
}

interface A
{
    void meth1();
}
interface B extends A
{
    void meth2();
}

class C implements B
{
    public void meth1()
    {
        System.out.println("m1");
    }
    public void meth2()
    {
        System.out.println("m2");
    }
}