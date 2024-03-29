class DoDont
{
    public static void main(String[] args)
    {
        System.out.println(Test.X);
        System.out.println(My.S);
    }
}

interface Test
{
    final static int X = 10;
    public abstract void meth1();
    public abstract void meth2();
    // private method in interface is available from java 9 onwards
    // private void meth3()
    // {
    //     System.out.println("private meth3 of Test");
    // }
    default void meth4()
    {
        // meth3();
        System.out.println("default method meth4 of Test");
    }
}

interface Test2 extends Test
{
    void meth5();
}

class My implements Test2
{
    final static String S = "final from class without obj";
    public void meth1(){};
    public void meth2(){};
    public void meth5(){};
}
