public class MethodOverriding {
    public static void main(String[] args) {
        Sup s = new Sub();
        s.display();
        s.show();
        s.prints();
        System.out.println(s instanceof Sup);
        System.out.println(s instanceof Sub);

    }
}

class Sup
{
    public void display()
    {
        System.out.println("Sup display method");
    }
    public void show()
    {
        System.out.println("Sup display method");
    }
}
class Sub extends Sup
{
    public void display()
    {
        System.out.println("Sub display method");
    }
    public void show(String s)
    {
        System.out.println("Sub display method : param"+s);
    }
    public void prints()
    {
        System.out.println("Sub display method : param");
    }
}
