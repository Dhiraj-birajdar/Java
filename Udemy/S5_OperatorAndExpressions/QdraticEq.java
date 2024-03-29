import java.lang.*;
import java.util.Scanner;

class QdraticEq
{
    public static void main(String[] args)
    {
        double r1, r2;
        float a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a b c resp : ");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        r1 = (-b + Math.sqrt(b*b-4*a*c))/(2*a);
        r2 = (-b - Math.sqrt(b*b-4*a*c))/(2*a);
        System.out.println("r1 = "+r1+"\nr2 = "+r2);

    }
}