public class Class {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.radius = 5;
        System.out.println(c.area());
        System.out.println(c.perimeter());
    }
}

class Circle
{
    public double radius;
    public double area()
    {
        return Math.PI*radius*radius;
    }
    public double perimeter()
    {
        return 2*Math.PI*radius*radius;
    }
}