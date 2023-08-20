import java.util.Scanner;

class CuboidArea
{
    public static void main(String[] args)
    {
        int l, b, h, v, ta;

        System.out.println("Enter length, breadth, height : ");
        Scanner sc = new Scanner(System.in);
        l = sc.nextInt();
        b = sc.nextInt();
        h = sc.nextInt();
        v = l * b * h;
        ta = l*b*2 + l*h*2 + b*h*2;
        System.out.println("Tortal Area = "+ta+"\nTotal Volume = "+v);


    }
}