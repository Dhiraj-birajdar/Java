public class Constructor
{
    public static void main(String[] args)
    {
        RectangleConstructor r1 = new RectangleConstructor();
        System.out.println(r1.area());
        System.out.println(r1.perimeter());
        System.out.println(r1.isSquare());
        
        RectangleConstructor r2 = new RectangleConstructor(5, 3);
        System.out.println(r2.area());
        System.out.println(r2.perimeter());
        System.out.println(r2.isSquare());

        RectangleConstructor r3 = new RectangleConstructor(5);
        System.out.println(r3.area());
        System.out.println(r3.perimeter());
        System.out.println(r3.isSquare());
        
    }
}

class RectangleConstructor
{
    // properties
    private int length;
    private int width;
    //constructors
    public RectangleConstructor()
    {
        length = 1;
        width = 1;
    }
    public RectangleConstructor(int s)
    {
        length = width = s;
    }
    public RectangleConstructor(int l, int w)
    {
        setLength(l);
        setWidth(w);
    }
    //getters setters
    public int getLength()
    {
        return length;
    }
    public int getWidth()
    {
        return width;
    }
    public void setWidth(int w)
    {
        if(w>0)
            width = w;
    }
    public void setLength(int l)
    {
        if(l>0)
            length = l;
    }
    // instance METHODS
    public int area()
    {
        return length*width;
    }
    public int perimeter()
    {
        return 2*(length+width);
    }
    public boolean isSquare()
    {
        return length == width;
    }
}