class A1_shape{
    public static void main(String[] args)
    {
        Circle c = new Circle(5);
        System.out.println(c.area());
        Rectangle r = new Rectangle(5, 4);
        System.out.println(r.area());
    }
}

abstract class Shape{

    abstract public double perimeter();
    abstract public double area();
}
class Circle extends Shape{
    private int radius;
    public Circle(int r){
        radius = r;
    }
    public double perimeter(){
        return 2 * 3.14 *radius;
    }
    public double area(){
        return 3.14*radius*radius;
    }
}
class Rectangle extends Shape{
    private int length;
    private int width;
    Rectangle(int l, int w){
        length = l;
        width = w;
    }
    public double area(){
        return length*width;
    }
    public double perimeter(){
        return 2*(length+width);
    }
}