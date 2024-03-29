// package access methods
import demo.Demo1;
import demo.*;
import demo.inner.Demo3;
class Main
{
    public static void main(String[] args)
    {
        System.out.println("Main class");
        Demo1 d1 = new Demo1();
        d1.display();
        demo.inner.Demo3 d3 = new demo.inner.Demo3(); // meth 3
        d3.display();
    }
}