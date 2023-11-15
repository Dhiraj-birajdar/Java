class InnerClassEx
{
    public static void main(String[] args)
    {
        Outer o = new Outer();
        o.outerDisplay();
        Outer.Inner oi = new Outer().new Inner();
    }
}

class Outer
{
    int x = 10;
    class Inner
    {
        int y = 20;
        void innerDisplay()
        {
            System.out.println(x);
            System.out.println(y);
        }
    }
    void outerDisplay()
    {
        Inner i = new Inner();
        i.innerDisplay();
        System.out.println(i.y);
    }

}