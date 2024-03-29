final class NoInheritance
{

}
class NoOverriding extends NoInheritance
{
    final void meth()
    {
        System.out.println("NoOverriding meth");
    }
}

class FinalDemo extends NoOverriding
{
    void meth()
    {
        System.out.println("FinalDemo meth");
    }
    final int PI = 5;
    public static void main(String[] args)
    {
        final int n;
        n = 2;
    }
}