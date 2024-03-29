class Method
{
    int max(int a, int b)
    {
        if(a>b)
            return a;
        return b;
    }

    static int min(int a, int b)
    {
        if(a<b)
            return a;
        return b;
    }

    public static void main(String[] args)
    {
        int a = 4, b = 5, c;
        Method m = new Method();
        c = m.max(a,b);
        System.out.println(c);
        // argument pass by value
        c = min(a, b);
        System.out.println(c);
    }
}