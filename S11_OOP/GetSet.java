public class GetSet {
    public static void main(String[] args)
    {
        RectangleGetSet r1 = new RectangleGetSet();
        r1.setLength(2); r1.setWidth(4);
        System.out.println(r1.area());
        System.out.println(r1.perimeter());
        System.out.println(r1.isSquare());
    }
    
}
class RectangleGetSet
{
    private int length;
    private int width;

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
