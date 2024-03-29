public class A2_Cylinder {
    public static void main(String[] args) {
        Cylinder cy = new Cylinder();
        cy.radius = 5; cy.height = 5;
        System.out.println(cy.baseArea());
        System.out.println(cy.lateralSurface());
        System.out.println(cy.surfaceArea());
        System.out.println(cy.volume());
    }
    
}

class Cylinder
{
    public double radius;
    public double height;

    public double baseArea()
    {
        return Math.PI * radius * radius;
    }
    public double lateralSurface()
    {
        return 2*Math.PI*radius*height;
    }
    public double surfaceArea()
    {
        return lateralSurface() + 2 * baseArea();
    }
    public double volume()
    {
        return baseArea() * height;
    }
}
