import java.util.Scanner;

class TriArea
{
    public static void main(String[] args)
    {
        float b, h, a;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter base and height of triangle respectively : ");
        b = s.nextFloat();
        h = s.nextFloat();
        a = (1.0f/2)*b*h;
        System.out.println("Area of triangle is "+a);
    }
}