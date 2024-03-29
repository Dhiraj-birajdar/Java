class namelessClass
{
    public static void main(String[] args)
    {
        OuterAnon oa = new OuterAnon();
        oa.meth();
    }
}

interface My
{
    void display();
}

class OuterAnon
{
    public void meth()
    {
        My m = new My()
        {
            public void display()
            {
                System.out.println("anonymous class");
            }
        };
        m.display();
    }
}