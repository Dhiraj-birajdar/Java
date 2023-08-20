import java.util.Scanner;
// import java.Math.sqrt;

class TriArea
{
    
    public static void main(String[] args)
    {
        BaseHeight bh = new BaseHeight();
        Sides si = new Sides();
        System.out.println("Area of triangle is "+bh.area()+"\t"+si.area());
    }
}
class BaseHeight
{
    float area()
    {
        float b, h;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter base and height of triangle respectively : ");
        b = s.nextFloat();
        h = s.nextFloat();
        return (1f/2)*b*h;
        // System.out.println("Area of triangle is "+a);
    }
}
class Sides
{
    float area()
    {
        float a, b, c, sum;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter sides a b c of triangle respectively : ");
        a = s.nextFloat();
        b = s.nextFloat();
        c = s.nextFloat();
        sum = (a+b+c)/2f;
        return (float)Math.sqrt(sum*(sum-a)*(sum-b)*(sum-c));
        // System.out.println("Area of triangle is "+a);
    }
}