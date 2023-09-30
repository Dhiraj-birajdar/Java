public class A1_Rect
{
    public static void main(String[] args)
    {
        Rectangle r1 = new Rectangle();
        r1.length = 2; r1.width = 4;
        System.out.println(r1.area());
        System.out.println(r1.perimeter());
        System.out.println(r1.isSquare());


    }
}

class Rectangle
{
    public int length;
    public int width;

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